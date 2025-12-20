package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 40;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não está autorizado a comprar bebida!");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não está autorizado a comprar bebida!");
        }
        //obs quando o if tem apenas uma linha de comando as chaves podem ser omitidas
        //ex: if(true) System.out.println("condição verdadeira");
        System.out.println("fora do if");

        boolean c = false;
        if(c = true) {
            System.out.println("nunca fazer isso, mas funciona");
        }
    }
}
