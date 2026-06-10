package org.usecase.design;

import org.eclipse.emf.ecore.EObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import org.usecase.usecase.UseCase;

import org.usecase.usecase.Actor; 
import org.usecase.usecase.Association;
import org.usecase.usecase.Model;
import org.usecase.usecase.Relation;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
    
    public EObject deleteNodeAndConnectedRelations(EObject element) {
        if (element == null) {
            return null;
        }

        EObject container = element.eContainer();

        if (container instanceof Model) {
            Model model = (Model) container;

            List<Relation> relationsToDelete = new ArrayList<>();

            for (Relation relation : model.getRelations()) {
                if (relation.getSource() == element || relation.getTarget() == element) {
                    relationsToDelete.add(relation);
                }
            }

            for (Relation relation : relationsToDelete) {
                EcoreUtil.delete(relation, true);
            }

            EcoreUtil.delete(element, true);

            return model;
        }

        EcoreUtil.delete(element, true);
        return container;
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
    
    public EObject exportUseCaseDescriptionsToWord(EObject self, EObject elementView) {
        try {
        	IFile diagramImageFile = getOrExportDiagramImage(self, elementView);
        	
            URI uri = self.eResource().getURI();

            if (!uri.isPlatformResource()) {
                return self;
            }

            String platformPath = uri.toPlatformString(true);

            IFile modelFile = ResourcesPlugin.getWorkspace()
                    .getRoot()
                    .getFile(new Path(platformPath));

            IProject project = modelFile.getProject();

            IFolder descriptionsFolder = project.getFolder("descriptions");

            if (!descriptionsFolder.exists()) {
                return self;
            }

            List<IFile> descriptionFiles = new ArrayList<>();

            for (IResource resource : descriptionsFolder.members()) {
                if (resource instanceof IFile) {
                    IFile file = (IFile) resource;

                    if ("ucdesc".equals(file.getFileExtension())) {
                        descriptionFiles.add(file);
                    }
                }
            }

            descriptionFiles.sort(Comparator.comparing(IFile::getName));

            StringBuilder documentText = new StringBuilder();

            documentText.append("Use Case Descriptions\n\n");

            for (IFile descriptionFile : descriptionFiles) {
                String content = new String(
                        descriptionFile.getContents().readAllBytes(),
                        StandardCharsets.UTF_8
                );

                documentText.append(content);
                documentText.append("\n\n");
            }

            byte[] diagramImageBytes = null;

            if (diagramImageFile != null && diagramImageFile.exists()) {
                diagramImageBytes = diagramImageFile.getContents().readAllBytes();
            }

            byte[] docxBytes = createDocx(documentText.toString(), diagramImageBytes);

            IFile outputFile = project.getFile("use_case_descriptions.docx");

            ByteArrayInputStream inputStream = new ByteArrayInputStream(docxBytes);

            if (outputFile.exists()) {
                outputFile.setContents(inputStream, true, true, null);
            } else {
                outputFile.create(inputStream, true, null);
            }

            outputFile.refreshLocal(IResource.DEPTH_ZERO, null);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return self;
    }
    
    private byte[] createDocx(String text, byte[] diagramImageBytes) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (ZipOutputStream zip = new ZipOutputStream(byteArrayOutputStream)) {
            addZipEntry(zip, "[Content_Types].xml", getContentTypesXml(diagramImageBytes != null));
            addZipEntry(zip, "_rels/.rels", getRelsXml());
            addZipEntry(zip, "word/_rels/document.xml.rels", getDocumentRelsXml(diagramImageBytes != null));
            addZipEntry(zip, "word/document.xml", getDocumentXml(text, diagramImageBytes != null));

            if (diagramImageBytes != null) {
                addZipBinaryEntry(zip, "word/media/use_case_diagram.png", diagramImageBytes);
            }
        }

        return byteArrayOutputStream.toByteArray();
    }

    private void addZipEntry(ZipOutputStream zip, String entryName, String content) throws Exception {
        ZipEntry entry = new ZipEntry(entryName);
        zip.putNextEntry(entry);
        zip.write(content.getBytes(StandardCharsets.UTF_8));
        zip.closeEntry();
    }

    private String getContentTypesXml(boolean includeDiagramImage) {
        String imageContentType = includeDiagramImage
                ? """
                    <Default Extension="png" ContentType="image/png"/>
                  """
                : "";

        return """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <Types xmlns="http://schemas.openxmlformats.org/package/2006/content-types">
                    <Default Extension="rels" ContentType="application/vnd.openxmlformats-package.relationships+xml"/>
                    <Default Extension="xml" ContentType="application/xml"/>
                """
                + imageContentType
                + """
                    <Override PartName="/word/document.xml" ContentType="application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml"/>
                </Types>
                """;
    }
    
    private String getDocumentRelsXml(boolean includeDiagramImage) {
        String imageRelationship = includeDiagramImage
                ? """
                    <Relationship Id="rIdDiagram"
                        Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/image"
                        Target="media/use_case_diagram.png"/>
                  """
                : "";

        return """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships">
                """
                + imageRelationship
                + """
                </Relationships>
                """;
    }

    private String getRelsXml() {
        return """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships">
                    <Relationship Id="rId1"
                        Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument"
                        Target="word/document.xml"/>
                </Relationships>
                """;
    }
    
    private void addZipBinaryEntry(ZipOutputStream zip, String entryName, byte[] content) throws Exception {
        ZipEntry entry = new ZipEntry(entryName);
        zip.putNextEntry(entry);
        zip.write(content);
        zip.closeEntry();
    }

    private String getDocumentXml(String text, boolean includeDiagramImage) {
        StringBuilder body = new StringBuilder();

        addTitle(body, "Use Case Specification Document");

        if (includeDiagramImage) {
            addHeading1(body, "Use Case Diagram");
            addDiagramImage(body);
            addEmptyParagraph(body);
        }

        String[] lines = text.split("\\R");

        for (String rawLine : lines) {
            String line = rawLine.trim();

            if (line.isBlank()) {
                addEmptyParagraph(body);
            } else if (line.startsWith("useCase ")) {
                String useCaseName = extractQuotedValue(line);
                addHeading1(body, "Use Case: " + useCaseName);
            } else if (line.startsWith("primaryActor:")) {
                addHeading2(body, "Primary Actor");
                addParagraph(body, extractQuotedValue(line));
            } else if (line.equals("stakeholdersAndGoals:")) {
                addHeading2(body, "Stakeholders and Goals");
            } else if (line.equals("preconditions:")) {
                addHeading2(body, "Preconditions");
            } else if (line.equals("postconditions:")) {
                addHeading2(body, "Postconditions");
            } else if (line.equals("mainFlow:")) {
                addHeading2(body, "Main Flow");
            } else if (line.equals("extensions:")) {
                addHeading2(body, "Extensions");
            } else if (line.equals("specialRequirements:")) {
                addHeading2(body, "Special Requirements");
            } else if (line.equals("technologyAndDataVariations:")) {
                addHeading2(body, "Technology and Data Variations");
            } else if (line.startsWith("frequencyOfOccurrence:")) {
                addHeading2(body, "Frequency of Occurrence");
                addParagraph(body, extractQuotedValue(line));
            } else if (line.equals("openIssues:")) {
                addHeading2(body, "Open Issues");
            } else if (line.startsWith("- ")) {
                addBullet(body, extractQuotedValue(line));
            } else if (line.matches("\\d+\\.\\s+.*")) {
                addNumberedLikeParagraph(body, line);
            } else if (line.matches("\\d+\\s+[a-zA-Z]\\.\\s+.*")) {
                addNumberedLikeParagraph(body, line);
            } else if (line.matches("\\d+\\s+[a-zA-Z]\\.\\s+\\d+\\.\\s+.*")) {
                addNumberedLikeParagraph(body, line);
            } else {
                addParagraph(body, line);
            }
        }

        return """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <w:document
                    xmlns:w="http://schemas.openxmlformats.org/wordprocessingml/2006/main"
                    xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships"
                    xmlns:wp="http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing"
                    xmlns:a="http://schemas.openxmlformats.org/drawingml/2006/main"
                    xmlns:pic="http://schemas.openxmlformats.org/drawingml/2006/picture">
                    <w:body>
                """
                + body.toString()
                + """
                        <w:sectPr>
                            <w:pgMar w:top="1440" w:right="1440" w:bottom="1440" w:left="1440" w:header="720" w:footer="720" w:gutter="0"/>
                        </w:sectPr>
                    </w:body>
                </w:document>
                """;
    }
    
    private void addDiagramImage(StringBuilder body) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:jc w:val="center"/>
                        <w:spacing w:after="240"/>
                    </w:pPr>
                    <w:r>
                        <w:drawing>
                            <wp:inline distT="0" distB="0" distL="0" distR="0">
                                <wp:extent cx="5486400" cy="3657600"/>
                                <wp:effectExtent l="0" t="0" r="0" b="0"/>
                                <wp:docPr id="1" name="Use Case Diagram"/>
                                <wp:cNvGraphicFramePr/>
                                <a:graphic>
                                    <a:graphicData uri="http://schemas.openxmlformats.org/drawingml/2006/picture">
                                        <pic:pic>
                                            <pic:nvPicPr>
                                                <pic:cNvPr id="0" name="use_case_diagram.png"/>
                                                <pic:cNvPicPr/>
                                            </pic:nvPicPr>
                                            <pic:blipFill>
                                                <a:blip r:embed="rIdDiagram"/>
                                                <a:stretch>
                                                    <a:fillRect/>
                                                </a:stretch>
                                            </pic:blipFill>
                                            <pic:spPr>
                                                <a:xfrm>
                                                    <a:off x="0" y="0"/>
                                                    <a:ext cx="5486400" cy="3657600"/>
                                                </a:xfrm>
                                                <a:prstGeom prst="rect">
                                                    <a:avLst/>
                                                </a:prstGeom>
                                            </pic:spPr>
                                        </pic:pic>
                                    </a:graphicData>
                                </a:graphic>
                            </wp:inline>
                        </w:drawing>
                    </w:r>
                </w:p>
                """);
    }
    
    private void addTitle(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:jc w:val="center"/>
                        <w:spacing w:after="400"/>
                    </w:pPr>
                    <w:r>
                        <w:rPr>
                            <w:b/>
                            <w:sz w:val="36"/>
                        </w:rPr>
                        <w:t>
                """);
        body.append(escapeXml(text));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addHeading1(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:spacing w:before="360" w:after="240"/>
                    </w:pPr>
                    <w:r>
                        <w:rPr>
                            <w:b/>
                            <w:sz w:val="30"/>
                        </w:rPr>
                        <w:t>
                """);
        body.append(escapeXml(text));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addHeading2(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:spacing w:before="240" w:after="120"/>
                    </w:pPr>
                    <w:r>
                        <w:rPr>
                            <w:b/>
                            <w:sz w:val="24"/>
                        </w:rPr>
                        <w:t>
                """);
        body.append(escapeXml(text));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addParagraph(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:spacing w:after="120"/>
                    </w:pPr>
                    <w:r>
                        <w:rPr>
                            <w:sz w:val="22"/>
                        </w:rPr>
                        <w:t xml:space="preserve">
                """);
        body.append(escapeXml(text));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addBullet(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:ind w:left="720" w:hanging="360"/>
                        <w:spacing w:after="80"/>
                    </w:pPr>
                    <w:r>
                        <w:t>• </w:t>
                    </w:r>
                    <w:r>
                        <w:rPr>
                            <w:sz w:val="22"/>
                        </w:rPr>
                        <w:t xml:space="preserve">
                """);
        body.append(escapeXml(text));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addNumberedLikeParagraph(StringBuilder body, String text) {
        body.append("""
                <w:p>
                    <w:pPr>
                        <w:ind w:left="720"/>
                        <w:spacing w:after="80"/>
                    </w:pPr>
                    <w:r>
                        <w:rPr>
                            <w:sz w:val="22"/>
                        </w:rPr>
                        <w:t xml:space="preserve">
                """);
        body.append(escapeXml(removeQuotesFromStep(text)));
        body.append("""
                        </w:t>
                    </w:r>
                </w:p>
                """);
    }

    private void addEmptyParagraph(StringBuilder body) {
        body.append("<w:p/>");
    }

    private String extractQuotedValue(String line) {
        int firstQuote = line.indexOf("\"");
        int lastQuote = line.lastIndexOf("\"");

        if (firstQuote != -1 && lastQuote > firstQuote) {
            return line.substring(firstQuote + 1, lastQuote);
        }

        if (line.startsWith("- ")) {
            return line.substring(2).trim();
        }

        return line;
    }

    private String removeQuotesFromStep(String line) {
        int firstQuote = line.indexOf("\"");
        int lastQuote = line.lastIndexOf("\"");

        if (firstQuote != -1 && lastQuote > firstQuote) {
            String prefix = line.substring(0, firstQuote).trim();
            String value = line.substring(firstQuote + 1, lastQuote);
            return prefix + " " + value;
        }

        return line;
    }

    private String escapeXml(String text) {
        return text
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
    
    private IFile getOrExportDiagramImage(EObject semanticElement, EObject elementView) {
        try {
            URI semanticUri = semanticElement.eResource().getURI();

            if (!semanticUri.isPlatformResource()) {
                return null;
            }

            String platformPath = semanticUri.toPlatformString(true);

            IFile modelFile = ResourcesPlugin.getWorkspace()
                    .getRoot()
                    .getFile(new Path(platformPath));

            IProject project = modelFile.getProject();

            IFile outputImage = project.getFile("use_case_diagram.png");

          
            if (outputImage.exists()) {
                return outputImage;
            }


            if (outputImage.getLocation() != null && outputImage.getLocation().toFile().exists()) {
                project.refreshLocal(IResource.DEPTH_INFINITE, null);

                if (outputImage.exists()) {
                    return outputImage;
                }
            }

            DDiagram diagram = getParentDiagram(elementView);

            if (diagram == null) {
                System.err.println("No Sirius diagram could be found.");
                return null;
            }

            Session session = SessionManager.INSTANCE.getSession(semanticElement);

            if (session == null) {
                System.err.println("No Sirius session could be found.");
                return null;
            }

            IPath outputLocation = outputImage.getLocation();

            if (outputLocation == null) {
                return null;
            }

            ExportFormat exportFormat = new ExportFormat(
                    ExportDocumentFormat.NONE,
                    ImageFileFormat.PNG
            );

            DialectUIManager.INSTANCE.export(
                    diagram,
                    session,
                    outputLocation,
                    exportFormat,
                    new NullProgressMonitor()
            );

            project.refreshLocal(IResource.DEPTH_INFINITE, null);

            if (outputImage.exists()) {
                return outputImage;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private DDiagram getParentDiagram(EObject elementView) {
        if (elementView instanceof DDiagram) {
            return (DDiagram) elementView;
        }

        if (elementView instanceof DDiagramElement) {
            return ((DDiagramElement) elementView).getParentDiagram();
        }

        return null;
    }
}
