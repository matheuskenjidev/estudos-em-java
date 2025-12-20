package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000.0;
        String mensagemDoar = "eu vou doar 500 para o Kenji";
        String mensagemNaoDoar = "ainda n tenho condições de doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
                        //(condição)        ? verdadeiro  : falso


        /*if(salario > 5000) {
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        */
        System.out.println(resultado);
    }
}
