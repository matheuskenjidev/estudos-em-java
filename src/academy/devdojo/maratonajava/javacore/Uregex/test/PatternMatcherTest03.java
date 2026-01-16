package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = trás tudo que não é digito
        // \s = trás todos espaços em  branco \t \n \f \r
        // \S = todos os caracteres excuindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = tudo o que não for incluso no \w
        // []
        String regex = "0[xX][0-9a-fA-F]";//procure de a-z, ou de A-Z
        String texto = "12 Ox Ox 0xFFABC 0x109 Ox1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
