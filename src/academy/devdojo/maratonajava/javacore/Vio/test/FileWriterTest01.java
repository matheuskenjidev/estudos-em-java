package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) { //true serve para dizer para adicionar ao final do arquivo e n reescrever ele
            fw.write("Salve rapaziada do mal!");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
