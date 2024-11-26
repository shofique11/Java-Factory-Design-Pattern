//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory;
        // PDF generate
        documentFactory = new PDFDocumentFactory();
        documentFactory.generateDocument();
        // Word document
        documentFactory = new WordDocumentFactory();
        documentFactory.generateDocument();
        // Excel document
        documentFactory = new ExcellDocumentFactory();
        documentFactory.generateDocument();

    }
}