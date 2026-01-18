package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Matheus\\Desktop\\estudos-em-java\\pasta\\arquivo.txt");
        System.out.println(p1.getFileName().toFile().toPath());
        Path p2 = Paths.get("C:\\Users\\Matheus\\Desktop\\estudos-em-java\\pasta", "arquivo.txt");
        Path p3 = Paths.get("C:", "Users\\Matheus\\Desktop\\estudos-em-java\\pasta", "arquivo.txt");
        Path p4 = Paths.get("C:\\Users\\Matheus\\Desktop\\estudos-em-java\\pasta\\arquivo.txt");


    }
}
