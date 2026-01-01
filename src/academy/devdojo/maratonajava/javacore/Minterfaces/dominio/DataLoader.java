package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;//TODOS ATRIBUTOS EM UMA INTERFACE SÃO PUBLIC STATIC FINAL
    void load();//por padrão os métodos em uma interface são public abstract
    default void checkPermission() { //métodos dafault as classes que implementam a interface não são obrigadas a implementar esse método
        System.out.println("fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
