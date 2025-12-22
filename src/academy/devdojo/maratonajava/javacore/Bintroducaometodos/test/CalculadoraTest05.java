package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);//var args tranforma inteiros em array nesse caso
        //Em Java, varargs (variable arguments) é um recurso que permite que um método receba uma quantidade variável de parâmetros do mesmo tipo, sem você precisar criar um array manualmente.
    }
}
