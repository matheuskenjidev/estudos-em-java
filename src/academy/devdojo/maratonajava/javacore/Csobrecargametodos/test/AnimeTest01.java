package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dororo", "Shounen", 23);
        anime.setNotaAvaliacao(8);
        anime.imprime();
        anime.init("Boku No Piko", "Shounen", 5, 10);
        anime.imprime();
    }
}
