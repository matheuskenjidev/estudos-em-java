package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(2-1);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double a, double b) {
        return a / b;
    }

    public void imprimeDivisaoDeDoisNumeros(double a, double b) {
        if(b == 0) {
            System.out.println("não existe divisão por 0");
            return;// dentro de métodos sem retorno podemos colocar o return para parar execução
        }
        System.out.println("continua execução");
    }

    public void alteraDoisNumero(int a, int b) {
        a = 99;
        b = 33;
        System.out.println("Dentro do alteraDoisNumeross");
        System.out.println(a);
        System.out.println(b);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {//transforma em array
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}
