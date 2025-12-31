package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{//funcionario ganha todas as propriedades e métodos de Pessoa
    private double salario;

    static {
        System.out.println("dentro do bloco static de Funcionario");
    }

    {
        System.out.println("bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("bloco de inicialização de Funcionario 2");
    }
    public Funcionario(String nome, double salario) {
        super(nome);
        System.out.println("dentro do construtor de Funcionario");
        this.salario = salario;
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        //Em Java, a palavra-chave super é usada para acessar membros da classe pai (superclasse) a partir de uma classe filha (subclasse).
        //Isso é comum quando a classe filha sobrescreve (override) um método, mas quer reaproveitar o comportamento original da superclasse
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("eu " + this.nome+ "recebi " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
