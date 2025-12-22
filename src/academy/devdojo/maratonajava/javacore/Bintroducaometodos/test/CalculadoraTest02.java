package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        int a = 2;
        if(a == 1) {
            System.out.println("dentro do if");
            return;
        }
        System.out.println("fora do if");

        Calculadora calculadora = new Calculadora();
        calculadora.imprimeDivisaoDeDoisNumeros(4,0);
    }
}
