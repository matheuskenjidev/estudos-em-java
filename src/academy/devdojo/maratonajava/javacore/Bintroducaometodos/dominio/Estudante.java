package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("--------------------------");
        System.out.println(this.nome); //Em Java, this se refere à própria instância do objeto da classe atual.
        System.out.println(this.sexo);
        System.out.println(this.idade);
    }
}
