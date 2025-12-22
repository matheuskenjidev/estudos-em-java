package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumero(a, b);

        System.out.println(a);
        System.out.println(b);
    }
}
