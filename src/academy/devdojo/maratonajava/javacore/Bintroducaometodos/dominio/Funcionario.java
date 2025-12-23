package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private  double[] salarios;
    private double media;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        for(double salario: this.salarios) {
            System.out.println(salario);
        }
    }


    public void imprimeMediaSalario() {
        double somaSalario = 0;

        for (int i = 0; i < this.salarios.length ; i++) {
            somaSalario += salarios[i];
        }

        System.out.println("Média salarial em 3 meses é = " + somaSalario / this.salarios.length);
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public double getMedia() {
        return this.media;
    }
}
