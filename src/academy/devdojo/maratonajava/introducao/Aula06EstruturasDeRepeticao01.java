package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;

        while(contador < 5) {
            System.out.println(contador);
            contador ++;
        }

        int contador2 = 0;
        do {
            System.out.println("dentro do while");
            contador2++;
        }while (contador2 < 5);

        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
