public abstract class DocumentFactory {
    public abstract Document createDocument();
    public  void generateDocument(){
        // Use the factory method to create a document
        Document document = createDocument();
        document.generate();
    }
}
