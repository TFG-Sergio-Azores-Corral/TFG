package org.usecase.design;

import org.eclipse.emf.ecore.EObject;

import java.util.ArrayList;
import java.util.List;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import org.usecase.usecase.UseCase;

import org.usecase.usecase.Actor;
import org.usecase.usecase.Association;
import org.usecase.usecase.Model;
import org.usecase.usecase.Relation;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public EObject openOrCreateUseCaseDescription(EObject self) {
        if (!(self instanceof UseCase)) {
            return self;
        }

        UseCase useCase = (UseCase) self;

        try {
            URI uri = useCase.eResource().getURI();

            if (!uri.isPlatformResource()) {
                return self;
            }

            String platformPath = uri.toPlatformString(true);
            IFile modelFile = ResourcesPlugin.getWorkspace()
                    .getRoot()
                    .getFile(new Path(platformPath));

            IProject project = modelFile.getProject();

            IFolder folder = project.getFolder("descriptions");
            if (!folder.exists()) {
                folder.create(true, true, null);
            }

            String useCaseName = useCase.getName();
            String safeName = useCaseName.replaceAll("[^a-zA-Z0-9_]", "_");
            String primaryActorName = getPrimaryActorName(useCase);
            List<String> associatedActorNames = getAssociatedActorNames(useCase);
            
            StringBuilder stakeholdersBuilder = new StringBuilder();

            if (associatedActorNames.isEmpty()) {
                stakeholdersBuilder.append("- \"TODO: TODO\"\n");
            } else {
                for (String actorName : associatedActorNames) {
                    stakeholdersBuilder.append("- \"")
                            .append(actorName)
                            .append(": TODO\"\n");
                }
            }

            IFile descFile = folder.getFile(safeName + ".ucdesc");

            if (!descFile.exists()) {
            	String content =
            	        "useCase \"" + useCaseName + "\"\n\n" +

            	        "primaryActor: \"" + primaryActorName + "\"\n\n" +

						"stakeholdersAndGoals:\n" +
						stakeholdersBuilder.toString() + "\n" +

            	        "preconditions:\n" +
            	        "- \"TODO\"\n\n" +

            	        "postconditions:\n" +
            	        "- \"TODO\"\n\n" +

            	        "mainFlow:\n" +
            	        "1. \"TODO\"\n" +
            	        "2. \"TODO\"\n" +
            	        "3. \"TODO\"\n\n" +

            	        "extensions:\n" +
            	        "1 a. \"TODO\"\n" +
            	        "1 a. 1. \"TODO\"\n\n" +

            	        "specialRequirements:\n" +
            	        "- \"TODO\"\n\n" +

            	        "technologyAndDataVariations:\n" +
            	        "- \"TODO\"\n\n" +

            	        "frequencyOfOccurrence: \"TODO\"\n\n" +

            	        "openIssues:\n" +
            	        "- \"TODO\"\n";

                descFile.create(
                        new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8)),
                        true,
                        null
                );
            }

            IWorkbenchPage page = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow()
                    .getActivePage();

            IDE.openEditor(page, descFile);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return self;
    }
    
    private String getPrimaryActorName(UseCase useCase) {
        EObject container = useCase.eContainer();

        if (!(container instanceof Model)) {
            return "TODO";
        }

        Model model = (Model) container;

        for (Relation relation : model.getRelations()) {
            if (relation instanceof Association && relation.getTarget() == useCase) {
                if (relation.getSource() instanceof Actor) {
                    Actor actor = (Actor) relation.getSource();
                    return actor.getName();
                }
            }
        }

        return "TODO";
    }
    
    private List<String> getAssociatedActorNames(UseCase useCase) {
        List<String> actorNames = new ArrayList<>();

        EObject container = useCase.eContainer();

        if (!(container instanceof Model)) {
            return actorNames;
        }

        Model model = (Model) container;

        for (Relation relation : model.getRelations()) {
            if (relation instanceof Association && relation.getTarget() == useCase) {
                if (relation.getSource() instanceof Actor) {
                    Actor actor = (Actor) relation.getSource();

                    if (actor.getName() != null && !actorNames.contains(actor.getName())) {
                        actorNames.add(actor.getName());
                    }
                }
            }
        }

        return actorNames;
    }
}
