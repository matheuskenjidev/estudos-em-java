package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Kenji"; //String constant pool
        String nome2 = "Kenji";
        String nomeESobrenome = nome.concat(" Nishimura");//criando uma nova String na pool

        System.out.println(nome);
        System.out.println(nomeESobrenome);
        System.out.println(nome == nome2); //comparando as referências

        String nome3 = new String("Kenji");//com o new o objeto é criado no heap de memória
        System.out.println(nome3 == nome2);
        System.out.println(nome2 == nome3.intern());
    }
}
