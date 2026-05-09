package org.usecase.validation;

import org.eclipse.xtext.validation.Check;

import org.usecase.usecasedsl.BulletItem;
import org.usecase.usecasedsl.NumberedStep;
import org.usecase.usecasedsl.UseCaseDescription;
import org.usecase.usecasedsl.UsecasedslPackage;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.usecase.usecase.Actor;
import org.usecase.usecase.Model;
import org.usecase.usecase.UMLElement;
import org.usecase.usecase.UsecasePackage;

public class UseCaseDslValidator extends AbstractUseCaseDslValidator {

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

            String projectName = descUri.segment(1);

            URI modelUri = URI.createPlatformResourceURI(
                    "/" + projectName + "/My.usecase",
                    true
            );

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
}