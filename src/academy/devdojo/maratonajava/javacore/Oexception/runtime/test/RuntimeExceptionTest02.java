package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b for 0
     */
    public static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("o segundo argumento n pode ser 0");
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            divisao(2,0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("código funcionando ainda");
    }
}
