package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch (Exception e) {
            e.printStackTrace();
        } finally { //bloco de execução que será sempre executado
            System.out.println("Fechando recurso liberado pelo S.O");
        }
        return null;
    }

    public static void abreConexao02() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally { //bloco de execução que será sempre executado
            System.out.println("Fechando recurso liberado pelo S.O");
        }
    }
}
