package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private double notaAvaliacao;

    public void init(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public void init(String nome, String genero, int episodios, double notaAvaliacao) {
        this.init(nome, genero, episodios);
        this.notaAvaliacao = notaAvaliacao;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.notaAvaliacao);
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public double getNotaAvaliacao() {
        return this.notaAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
