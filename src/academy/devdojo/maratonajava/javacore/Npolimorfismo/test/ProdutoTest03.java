package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("samsumg", 2000);
        Tomate tomate = new Tomate("cereja", 2000);

        tomate.setDataValidade("28/06/2026");

        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImpostoProduto(produto);
    }
}
