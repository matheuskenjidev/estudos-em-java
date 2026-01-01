package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados de uma arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissões no arquivo");
    }
}
