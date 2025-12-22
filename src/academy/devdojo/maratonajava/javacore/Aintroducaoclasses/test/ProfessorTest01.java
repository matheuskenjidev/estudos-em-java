package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Ronaldo";
        professor.idadeProfessor = 45;
        professor.sexoProfesor = 'M';

        System.out.println(professor.nomeProfessor + " " + professor.idadeProfessor + " " + professor.sexoProfesor);
    }
}
