package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = trás tudo que não é digito
        // \s = trás todos espaços em  branco \t \n \f \r
        // \S = todos os caracteres excuindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = tudo o que não for incluso no \w
        String regex = "\\W";
        String texto = "@$asoud 2323hau_sihd2323";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
