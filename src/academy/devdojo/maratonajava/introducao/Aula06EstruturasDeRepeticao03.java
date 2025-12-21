package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 numeros de um dado valor, por exemplo 50
    public static void main(String[] args) {
        int valor = 50;
        for(int i = 0; i <= valor; i++) {
            System.out.println(--valor);
            if(i == 24) {
                break;
            }
        }
    }
}
