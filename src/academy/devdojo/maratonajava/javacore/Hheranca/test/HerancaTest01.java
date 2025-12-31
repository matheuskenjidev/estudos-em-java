package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das palmeiras", "1732323");
        Pessoa pessoa = new Pessoa("Alvin");
        pessoa.setCpf("23123123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Juzé");
        funcionario.setCpf("23123123");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(23454);

        System.out.println("------------------------------------");
        funcionario.imprime();
    }
}
