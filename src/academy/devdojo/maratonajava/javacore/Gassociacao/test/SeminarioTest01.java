package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das flores");
        Aluno aluno = new Aluno("matheus", 23);
        Professor2 professor = new Professor2("roberto", "pirataria");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("onde achar o tesouro", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
