public class Main {
    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler DocHandler = new DocFileHandler("Doc Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(DocHandler); // chain starts here!
        DocHandler.setHandler(imageHandler);
        
        textHandler.process(new File("Test_1", "text", "C:/OOP"));
        DocHandler.process(new File("Test_2", "file", "C:/OOP"));
        imageHandler.process(new File("Test_3", "image", "C:/OOP"));

    }
}