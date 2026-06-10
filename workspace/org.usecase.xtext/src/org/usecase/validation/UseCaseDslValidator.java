package org.usecase.validation;

import org.eclipse.xtext.validation.Check;

import org.usecase.usecasedsl.BulletItem;
import org.usecase.usecasedsl.NumberedStep;
import org.usecase.usecasedsl.UseCaseDescription;
import org.usecase.usecasedsl.UsecasedslPackage;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.usecase.usecase.Actor;
import org.usecase.usecase.Association;
import org.usecase.usecase.Model;
import org.usecase.usecase.Relation;
import org.usecase.usecase.UMLElement;
import org.usecase.usecase.UsecasePackage;
import org.usecase.usecase.UseCase;
import org.usecase.usecasedsl.ExtensionStep;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

public class UseCaseDslValidator extends AbstractUseCaseDslValidator {
	
	private URI findUseCaseModelUri(UseCaseDescription desc) {
	    if (desc.eResource() == null || desc.eResource().getURI() == null) {
	        return null;
	    }

	    URI descUri = desc.eResource().getURI();

	    if (!descUri.isPlatformResource()) {
	        return null;
	    }

	    String projectName = descUri.segment(1);

	    IProject project = ResourcesPlugin.getWorkspace()
	            .getRoot()
	            .getProject(projectName);

	    if (project == null || !project.exists()) {
	        return null;
	    }

	    final URI[] result = new URI[1];

	    try {
	        project.accept(resource -> {
	            if (result[0] != null) {
	                return false;
	            }

	            if (resource instanceof IFile) {
	                IFile file = (IFile) resource;

	                if ("usecase".equals(file.getFileExtension())) {
	                    result[0] = URI.createPlatformResourceURI(
	                            file.getFullPath().toString(),
	                            true
	                    );
	                    return false;
	                }
	            }

	            return true;
	        });
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return result[0];
	}

    @Check
    public void checkPrimaryActorIsDefined(UseCaseDescription desc) {
        if (desc.getPrimaryActor() == null
                || desc.getPrimaryActor().isBlank()
                || desc.getPrimaryActor().equals("TODO")) {

            warning(
                "The primary actor should be defined.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__PRIMARY_ACTOR
            );
        }
    }

    @Check
    public void checkUseCaseNameIsDefined(UseCaseDescription desc) {
        if (desc.getName() == null
                || desc.getName().isBlank()
                || desc.getName().equals("TODO")) {

            warning(
                "The use case name should be defined.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__NAME
            );
        }
    }

    @Check
    public void checkMainFlowHasSteps(UseCaseDescription desc) {
        if (desc.getMainSteps() == null || desc.getMainSteps().isEmpty()) {
            warning(
                "The main flow should contain at least one step.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__MAIN_STEPS
            );
        }
    }

    @Check
    public void checkPreconditionsAreDefined(UseCaseDescription desc) {
        if (desc.getPreconditions() == null || desc.getPreconditions().isEmpty()) {
            warning(
                "At least one precondition should be defined.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__PRECONDITIONS
            );
        }
    }

    @Check
    public void checkPostconditionsAreDefined(UseCaseDescription desc) {
        if (desc.getPostconditions() == null || desc.getPostconditions().isEmpty()) {
            warning(
                "At least one postcondition should be defined.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__POSTCONDITIONS
            );
        }
    }

    @Check
    public void checkBulletItemIsCompleted(BulletItem item) {
        if (item.getText() == null
                || item.getText().isBlank()
                || item.getText().equals("TODO")) {

            warning(
                "This item should be completed.",
                UsecasedslPackage.Literals.BULLET_ITEM__TEXT
            );
        }
    }

    @Check
    public void checkNumberedStepIsCompleted(NumberedStep step) {
        if (step.getText() == null
                || step.getText().isBlank()
                || step.getText().equals("TODO")) {

            warning(
                "This step should be completed.",
                UsecasedslPackage.Literals.NUMBERED_STEP__TEXT
            );
        }
    }
    
    @Check
    public void checkUseCaseNameMatchesFileName(UseCaseDescription desc) {
        if (desc.eResource() == null || desc.eResource().getURI() == null) {
            return;
        }

        URI uri = desc.eResource().getURI();
        String fileName = uri.lastSegment();

        if (fileName == null || !fileName.endsWith(".ucdesc")) {
            return;
        }

        String expectedFileName = fileName.substring(0, fileName.length() - ".ucdesc".length());

        String useCaseName = desc.getName();

        if (useCaseName == null || useCaseName.isBlank()) {
            return;
        }

        String normalizedUseCaseName = useCaseName.replaceAll("[^a-zA-Z0-9_]", "_");

        if (!expectedFileName.equals(normalizedUseCaseName)) {
            warning(
                "The use case name does not match the description file name.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__NAME
            );
        }
    }
    
    @Check
    public void checkPrimaryActorExistsInDiagramModel(UseCaseDescription desc) {
    	System.out.println("VALIDATING PRIMARY ACTOR");

	    String primaryActorName = desc.getPrimaryActor();
	    System.out.println("Primary actor: " + primaryActorName);


        if (primaryActorName == null
                || primaryActorName.isBlank()
                || primaryActorName.equals("TODO")) {
            return;
        }
        
        Model model = loadDiagramModel(desc);
        System.out.println("Loaded model: " + model);


        if (model == null) {
            warning(
                "The diagram model could not be loaded to validate the primary actor.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__PRIMARY_ACTOR
            );
            return;
        }

        boolean actorExists = false;

        for (UMLElement element : model.getElements()) {
            if (element instanceof Actor) {
                Actor actor = (Actor) element;

                if (primaryActorName.equals(actor.getName())) {
                    actorExists = true;
                    break;
                }
            }
        }

        if (!actorExists) {
            warning(
                "The primary actor does not exist in the use case diagram model.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__PRIMARY_ACTOR
            );
        }
    }
    
    private Model loadDiagramModel(UseCaseDescription desc) {
        try {
            if (desc.eResource() == null || desc.eResource().getURI() == null) {
                return null;
            }

            URI descUri = desc.eResource().getURI();

            if (!descUri.isPlatformResource()) {
                return null;
            }

            URI modelUri = findUseCaseModelUri(desc);

            if (modelUri == null) {
                return null;
            }

            ResourceSet resourceSet = new ResourceSetImpl();

            resourceSet.getPackageRegistry().put(
                    UsecasePackage.eNS_URI,
                    UsecasePackage.eINSTANCE
            );

            resourceSet.getResourceFactoryRegistry()
                    .getExtensionToFactoryMap()
                    .put("usecase", new XMIResourceFactoryImpl());

            Resource resource = resourceSet.getResource(modelUri, true);

            if (resource == null || resource.getContents().isEmpty()) {
                return null;
            }

            Object root = resource.getContents().get(0);

            if (root instanceof Model) {
                return (Model) root;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    @Check
    public void checkUseCaseExistsInDiagramModel(UseCaseDescription desc) {
        String useCaseName = desc.getName();

        if (useCaseName == null
                || useCaseName.isBlank()
                || useCaseName.equals("TODO")) {
            return;
        }

        Model model = loadDiagramModel(desc);

        if (model == null) {
            warning(
                "The diagram model could not be loaded to validate the use case name.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__NAME
            );
            return;
        }

        boolean useCaseExists = false;

        for (UMLElement element : model.getElements()) {
            if (element instanceof UseCase) {
                UseCase useCase = (UseCase) element;

                if (useCaseName.equals(useCase.getName())) {
                    useCaseExists = true;
                    break;
                }
            }
        }

        if (!useCaseExists) {
            warning(
                "The use case does not exist in the use case diagram model.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__NAME
            );
        }
    }
    
    @Check
    public void checkPrimaryActorIsAssociatedWithUseCase(UseCaseDescription desc) {
        String primaryActorName = desc.getPrimaryActor();
        String useCaseName = desc.getName();

        if (primaryActorName == null
                || primaryActorName.isBlank()
                || primaryActorName.equals("TODO")
                || useCaseName == null
                || useCaseName.isBlank()
                || useCaseName.equals("TODO")) {
            return;
        }

        Model model = loadDiagramModel(desc);

        if (model == null) {
            return;
        }

        boolean associationExists = false;

        for (Relation relation : model.getRelations()) {
            if (relation instanceof Association) {
                if (relation.getSource() instanceof Actor
                        && relation.getTarget() instanceof UseCase) {

                    Actor actor = (Actor) relation.getSource();
                    UseCase useCase = (UseCase) relation.getTarget();

                    if (primaryActorName.equals(actor.getName())
                            && useCaseName.equals(useCase.getName())) {
                        associationExists = true;
                        break;
                    }
                }
            }
        }

        if (!associationExists) {
            warning(
                "The primary actor is not associated with this use case in the diagram model.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__PRIMARY_ACTOR
            );
        }
    }
    
    @Check
    public void checkExtensionReferencesExistingMainStep(UseCaseDescription desc) {
        if (desc.getExtensions() == null || desc.getExtensions().isEmpty()) {
            return;
        }

        for (ExtensionStep extension : desc.getExtensions()) {
            int referencedStep = extension.getNumber();

            boolean mainStepExists = false;

            for (NumberedStep step : desc.getMainSteps()) {
                if (step.getNumber() == referencedStep) {
                    mainStepExists = true;
                    break;
                }
            }

            if (!mainStepExists) {
                warning(
                    "This extension refers to a main flow step that does not exist.",
                    UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__EXTENSIONS
                );
            }
        }
    }
    
    @Check
    public void checkMainFlowStepsAreSequential(UseCaseDescription desc) {
        if (desc.getMainSteps() == null || desc.getMainSteps().isEmpty()) {
            return;
        }

        int expectedNumber = 1;

        for (NumberedStep step : desc.getMainSteps()) {
            if (step.getNumber() != expectedNumber) {
                warning(
                    "Main flow steps should be sequential and start at 1.",
                    UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__MAIN_STEPS
                );
                return;
            }

            expectedNumber++;
        }
    }
    
    @Check
    public void checkStakeholdersExistInDiagramModel(UseCaseDescription desc) {
        Model model = loadDiagramModel(desc);

        if (model == null) {
            return;
        }

        for (BulletItem item : desc.getStakeholders()) {
            String text = item.getText();

            if (text == null || text.isBlank() || text.equals("TODO")) {
                continue;
            }

            String stakeholderName = extractStakeholderName(text);

            if (stakeholderName == null || stakeholderName.isBlank() || stakeholderName.equals("TODO")) {
                continue;
            }

            boolean actorExists = false;

            for (UMLElement element : model.getElements()) {
                if (element instanceof Actor) {
                    Actor actor = (Actor) element;

                    if (stakeholderName.equals(actor.getName())) {
                        actorExists = true;
                        break;
                    }
                }
            }

            if (!actorExists) {
                warning(
                    "The stakeholder '" + stakeholderName + "' does not exist as an actor in the diagram model.",
                    item,
                    UsecasedslPackage.Literals.BULLET_ITEM__TEXT
                );
            }
        }
    }
    
    @Check
    public void checkStakeholdersAreAssociatedWithUseCase(UseCaseDescription desc) {
        Model model = loadDiagramModel(desc);

        if (model == null) {
            return;
        }

        String useCaseName = desc.getName();

        if (useCaseName == null || useCaseName.isBlank() || useCaseName.equals("TODO")) {
            return;
        }

        for (BulletItem item : desc.getStakeholders()) {
            String text = item.getText();

            if (text == null || text.isBlank() || text.equals("TODO")) {
                continue;
            }

            String stakeholderName = extractStakeholderName(text);

            if (stakeholderName == null || stakeholderName.isBlank() || stakeholderName.equals("TODO")) {
                continue;
            }

            boolean associationExists = false;

            for (Relation relation : model.getRelations()) {
                if (relation instanceof Association
                        && relation.getSource() instanceof Actor
                        && relation.getTarget() instanceof UseCase) {

                    Actor actor = (Actor) relation.getSource();
                    UseCase useCase = (UseCase) relation.getTarget();

                    if (stakeholderName.equals(actor.getName())
                            && useCaseName.equals(useCase.getName())) {
                        associationExists = true;
                        break;
                    }
                }
            }

            if (!associationExists) {
                warning(
                    "The stakeholder '" + stakeholderName + "' is not associated with this use case in the diagram model.",
                    item,
                    UsecasedslPackage.Literals.BULLET_ITEM__TEXT
                );
            }
        }
    }          
    
    private String extractStakeholderName(String stakeholderText) {
        int colonIndex = stakeholderText.indexOf(":");

        if (colonIndex == -1) {
            return stakeholderText.trim();
        }

        return stakeholderText.substring(0, colonIndex).trim();
    }
    
    @Check
    public void checkFrequencyOfOccurrenceIsDefined(UseCaseDescription desc) {
        if (desc.getFrequency() == null
                || desc.getFrequency().isBlank()
                || desc.getFrequency().equals("TODO")) {

            warning(
                "The frequency of occurrence should be defined.",
                UsecasedslPackage.Literals.USE_CASE_DESCRIPTION__FREQUENCY
            );
        }
    }
}