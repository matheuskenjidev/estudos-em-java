package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Ronaldo";
        String numeros = "012345";
        System.out.println(nome.charAt(0));//retorna o caractere na posição 0
        System.out.println(nome.length());//retorna a quantidade de caracteres da String
        System.out.println(nome.replace("n", "l"));
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2));//retorna uma outra String cortada de acordo com os aegumento especificados
        System.out.println(nome.trim());//remove os epaços em branco nocomeço e fim da string

    }
}
