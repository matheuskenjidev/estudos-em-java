package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void concatStringBuilder(int tamanho) {
         StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuilder(10_000);
        concatStringBuffer(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio));
        String concat = "2" + 3;
        System.out.println(concat instanceof String);
    }
}


