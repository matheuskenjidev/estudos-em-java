package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        int[] numeros2 = {1, 2, 3, 4, 5};//inicializando o array com valores
        int[] numeros3 = new int[] {1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for(int i: numeros3) { //esse foreach n dá para usar os índices
            System.out.println(i); //i a cada iteração pega a referencia de cada
                                    //posição do array
        }
    }
}
