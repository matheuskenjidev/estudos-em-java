package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
}
