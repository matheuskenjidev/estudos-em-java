package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, shor, int, long, float e double = 0 valor de inicialização padrão
        //char '/ u0000' ' ' unicode de espaço em branco
        //boolean false
        //String null

        String[] nomes = new String[3];
        nomes[0] = "Seiji";
        nomes[1] = "Kaori";
        nomes[2] = "Haruo";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];//nomes ganha uma nova referência de outro objeto
        //OBS: uma vez que se perde a referência de um obeto o garbage limpa ele
        //logo perdemos a referência para sempre
    }
}
