package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante junior = new Estudante();
        junior.idade = 26;
        junior.nome = "Junior";
        junior.sexo = 'M';

        System.out.println(junior.idade);
        System.out.println(junior.nome);
        System.out.println(junior.sexo);
    }
}
