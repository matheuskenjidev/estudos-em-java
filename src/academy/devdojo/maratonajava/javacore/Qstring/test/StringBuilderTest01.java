package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Matheus Kenji";
        nome.concat(" Nishimura");
        System.out.println(nome);

        //StringBuilder n tem imutabilidade
        StringBuilder sb = new StringBuilder("Roberto");//StringBuilder é diferente de String
        sb.append(" Carlos").append(" Cantor");
        sb.reverse();//inverte a ordem da String
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
