package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {//variáveis constantes(final) e static(da própria classe)
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }
}
