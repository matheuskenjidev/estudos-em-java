package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;//static:
    //O static indica que um atributo ou método pertence à classe, e não a um objeto específico.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("----------------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("velocidade limite: " + Carro.velocidadeLimite);
    }

    //OBS: this não pode ser usado em métodos static, pois this se refere ao objeto instanciado
    //e pode ser que ele nunca tenha sido instanciado
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
