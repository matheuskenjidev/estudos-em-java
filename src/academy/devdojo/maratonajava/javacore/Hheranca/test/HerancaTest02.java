package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0-Bloco de inicialização estárico da super classe é executado quando a JVM executar a classe PAI
    //1-bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    //2-Alocado espaço em memória para o objeto da classe pai
    //3-Cada atributo de classe pai é´criado e inicializado com valores default ou com oq for passado da classe pai
    //4-Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5-construtor da superclasse é executado
    //6-Alocado espaço em memória para o objeto da classe filha
    //7-Cada atributo de classe filha é´criado e inicializado com valores default ou com oq for passado
    //8-Bloco de inicialização da classe filha é executado na ordem em que aparece
    //9-construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("adsadas");

    }
}
