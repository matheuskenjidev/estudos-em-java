package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1- alocado epaço em memória para o objeto
    //2-cada atributo de classe é criado e inicializado com valores dafault ou o que for passado
    //3-bloco de inicialização éxecutado
    //4-construtor é executado
    {//bloco que é executado primeiro que o construtor
        System.out.println("Dentro do bloco de inicalização");
        this.episodios = new int[100];//inicializa o array com 100 numeros dafault e tamanho
        System.out.println(this.episodios);
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios) {
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
