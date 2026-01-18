package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");//cria um objeto tipo file
        try {

            boolean isCreated = file.createNewFile(); //cria o arquivo e retorna um boolean
            System.out.println(isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("path: " + file.getAbsolutePath());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());//verifica se é arquivo oculto
            System.out.println("last modified: " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists) {
                System.out.println(file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
