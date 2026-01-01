package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {//final em classes proibe outras classes de fazer a extenção
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    private final Comprador COMPRADOR = new Comprador();
    //REFERÊNCIA AO OBJETO NUNCA PODE SER ALTERADA

    public final void imprime() {//final em métodos n deixa ele ser sobrescrito em outras classes
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
