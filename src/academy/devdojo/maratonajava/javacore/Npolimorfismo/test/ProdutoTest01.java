package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("positivo fodido", 6000);
        Tomate tomate = new Tomate("Tomate Cereja", 50);
        Televisao televisao = new Televisao("sasumg 50", 5000);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("------------------------------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImpostoProduto(televisao);
    }
}
