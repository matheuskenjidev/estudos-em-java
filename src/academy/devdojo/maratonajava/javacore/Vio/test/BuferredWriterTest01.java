package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuferredWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.newLine();
            br.write("saajsfdoidhsfuosdgf asfdhaosdfhn");
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
