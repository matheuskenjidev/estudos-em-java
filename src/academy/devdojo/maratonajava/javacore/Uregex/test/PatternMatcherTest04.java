package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = trás tudo que não é digito
        // \s = trás todos espaços em  branco \t \n \f \r
        // \S = todos os caracteres excuindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o //ovo / oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";//procure de a-z, ou de A-Z
        String texto = "12 0 0x 0xFFABC 0x10G 0x1";
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
