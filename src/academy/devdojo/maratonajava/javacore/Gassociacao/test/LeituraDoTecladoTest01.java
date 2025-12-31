package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome  = input.nextLine();
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);//NEXT retorna apenas a primeira palavra antes do primeiroe espaço

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
    }
}
