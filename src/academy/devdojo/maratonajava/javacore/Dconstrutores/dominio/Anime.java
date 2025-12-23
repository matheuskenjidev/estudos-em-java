package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private double notaAvaliacao;
    private String estudio;

    public Anime() {//contrutor, obs: funções construtore n tem retorno

    }

    public Anime(String nome, String genero, int episodios, double notaAvaliacao) {
        this();//this dentro de um construtor se refere ao próprio contrutor
        //OBS: this deve ser sempre a primeira linha se for chamar outro construtor
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.notaAvaliacao = notaAvaliacao;
    }

    public Anime(String nome, String genero, int episodios, double notaAvaliacao, String estudio) {
        this(nome, genero, episodios, notaAvaliacao);//this dentro do construtor se refere ao próprio contrutor
        this.estudio = estudio;
    }

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
        System.out.println(this.estudio);
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
