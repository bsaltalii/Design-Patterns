package CompositeDesignPattern.FileSystemExample;

import CompositeDesignPattern.FileSystemExample.File;
import CompositeDesignPattern.FileSystemExample.FileSystemComponent;
import CompositeDesignPattern.FileSystemExample.Folder;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("resume.pdf");
        FileSystemComponent file2 = new File("photo.jpg");
        FileSystemComponent file3 = new File("notes.txt");

        Folder documents = new Folder("Documents");
        documents.addComponent(file1);
        documents.addComponent(file3);

        Folder pictures = new Folder("Pictures");
        pictures.addComponent(file2);

        Folder root = new Folder("Root");
        root.addComponent(documents);
        root.addComponent(pictures);

        root.showDetails();
    }
}
