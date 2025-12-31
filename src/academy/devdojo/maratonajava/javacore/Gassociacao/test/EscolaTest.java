package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Obito");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Apae", professores);

        escola.imprime();
    }
}
