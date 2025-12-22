package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Cleitin";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante1.nome = "Kaori";
        estudante1.idade = 17;
        estudante1.sexo = 'F';

        impressora.imprime(estudante);

        System.out.println("-----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("------------------------");

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
    }
}
