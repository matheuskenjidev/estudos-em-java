package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0- bloco de inicialização é executado quando a JVM carregar a classe
    //1- alocado epaço em memória para o objeto
    //2-cada atributo de classe é criado e inicializado com valores dafault ou o que for passado
    //3-bloco de inicialização éxecutado
    //4-construtor é executado
    static {//bloco que é executado primeiro que o construtor
        System.out.println("Dentro do bloco de inicalização");
        Anime.episodios = new int[100];//inicializa o array com 100 numeros dafault e tamanho
        System.out.println(Anime.episodios);
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("segundo bloco de inicialização estático");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: Anime.episodios) {
            System.out.println(episodio);
        }

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
