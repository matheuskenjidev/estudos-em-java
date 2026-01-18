package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BaicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pata2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastModifiedTime();
        FileTime fileTime2 = basicFileAttributes.lastAccessTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(fileTime1, newCreationTime,fileTime);

        fileTime = fileAttributeView.readAttributes().creationTime();
        fileTime1 = fileAttributeView.readAttributes().lastModifiedTime();
        fileTime2 = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);
    }
}
