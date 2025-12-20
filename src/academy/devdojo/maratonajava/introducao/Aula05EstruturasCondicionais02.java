package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 19;
        if (idade < 0) {
            System.out.println("insira uma idade válida");
        }
        if(idade < 15) {
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        }else {
            System.out.println("categoria adulta");
        }

        String categoria = idade < 15 ? "categoria infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "categoria adulta";
        System.out.println(categoria);
    }
}
