package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked e Unchecked
        //exceções checked - são filhas diretas de exception e caso n tratadas lançam um erro em tempo de compilação
        //exceções unchecked - são runtimes exception ou filhas dessa classe(não é obrigatório tratar)

        //runtime exception(geralmente é erro do programador)
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
