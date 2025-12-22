package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Corsa";
        carro.modelo = "Hatch";
        carro.ano = 1998;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Ferrari";
        carro2.modelo = "Conversível";
        carro2.ano = 2023;

        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
