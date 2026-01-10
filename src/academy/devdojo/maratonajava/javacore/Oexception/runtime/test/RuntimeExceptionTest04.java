package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndex");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBound");
        }catch (IllegalArgumentException e) {
            System.out.println("Dentro do illegal");
        }catch (RuntimeException e) {
            System.out.println("Dentro do runtime exception");
        }

        try {
            talvezLenceException();
        }catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLenceException() throws SQLException, FileNotFoundException {

    }
}
