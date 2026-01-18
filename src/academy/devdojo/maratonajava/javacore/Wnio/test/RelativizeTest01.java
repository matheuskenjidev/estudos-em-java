package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //relativizar:
        Path dir = Paths.get("/home/kenji");
        Path clazz = Paths.get("/home/kenji/devdojo/olaMundo.java");

        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/kenji");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/kenji/devdojo/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.202323");

        System.out.println(absoluto1.relativize(absoluto3));
        System.out.println(absoluto3.relativize(absoluto1));
        System.out.println(absoluto1.relativize(absoluto2));
        System.out.println(relativo1.relativize(relativo2));
    }
}
