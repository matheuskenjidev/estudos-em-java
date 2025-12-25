package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);;
        //Carro.velocidadeLimite = 180;//como velocidadeLimite é static vai alterar o valor na clase
        //static quer dizer que o atributo ou método é da classe e não das instâncias da classe
        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("--------------------------");
        System.out.println(Carro.getVelocidadeLimite());
    }
}
