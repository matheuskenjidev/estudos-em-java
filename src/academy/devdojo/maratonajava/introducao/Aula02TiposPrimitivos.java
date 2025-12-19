package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos:Em Java, variáveis primitivas são variáveis
        // que guardam valores simples e diretos, não objetos.
        //Elas armazenam o valor em si, e não uma referência.


        //int, double, float, char, byte, short, long, boolean

        long numeroGrande = 100000L;//casting (int) 10000000 força o long a virar int
        int notaDoPai = 36;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 19;
        short idadeShort = 10;
        boolean verdadeiro = true;
        char caractere = 'M';

        //OBS: string n é primitiva, pois é um valor por referencia
        String nome = "Matheus Kenji";

        System.out.println("a idade do pai é: " + notaDoPai + " anos");
        System.out.println(nome);

        //java 10
        var quantidadeDeLivros = 20;
        System.out.println(quantidadeDeLivros);
    }
}
