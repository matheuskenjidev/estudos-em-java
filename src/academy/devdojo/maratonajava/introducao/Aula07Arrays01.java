package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];//apenas tipos de referência como arrays
                            //podem ser inicializados com null
        //ou int idades[];
        System.out.println(idades);
        idades[1] = 24;
        System.out.println(idades[1]);
    }
}
