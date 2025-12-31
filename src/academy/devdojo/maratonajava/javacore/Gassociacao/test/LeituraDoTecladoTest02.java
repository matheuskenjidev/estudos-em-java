package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta");
        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == ' ') {
            System.out.println("sim");
        }else {
            System.out.println("não ");
        }
    }
}
