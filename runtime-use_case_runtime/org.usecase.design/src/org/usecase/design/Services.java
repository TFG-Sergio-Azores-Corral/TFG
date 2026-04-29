package org.usecase.design;

import org.eclipse.emf.ecore.EObject;

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

            IFile descFile = folder.getFile(safeName + ".ucdesc");

            if (!descFile.exists()) {
                String content =
                        "casoUso \"" + useCaseName + "\"\n\n" +
                        "actorPrimario: \"TODO\"\n\n" +
                        "interesadosObjetivos:\n" +
                        "- \"TODO\"\n\n" +
                        "precondiciones:\n" +
                        "- \"TODO\"\n\n" +
                        "postcondiciones:\n" +
                        "- \"TODO\"\n\n" +
                        "escenarioPrincipal:\n" +
                        "1. \"TODO\"\n\n" +
                        "extensiones:\n\n" +
                        "requisitosEspeciales:\n" +
                        "- \"TODO\"\n\n" +
                        "variacionesTecnologiaDatos:\n" +
                        "- \"TODO\"\n\n" +
                        "frecuenciaOcurrencia: \"TODO\"\n\n" +
                        "temasAbiertos:\n" +
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
}
