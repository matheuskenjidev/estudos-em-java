package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Cleitin";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante1.nome = "Kaori";
        estudante1.idade = 17;
        estudante1.sexo = 'F';

        estudante.imprime();
        estudante1.imprime();
    }
}
