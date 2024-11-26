public class ExcellDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new ExcellDocument();
    }
}
