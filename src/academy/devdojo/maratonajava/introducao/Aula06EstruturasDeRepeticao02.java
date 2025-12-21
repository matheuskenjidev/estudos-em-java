package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 100000
        for(int i = 0; i <= 100000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
