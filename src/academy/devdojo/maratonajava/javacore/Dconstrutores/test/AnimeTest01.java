package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "Shounen", 104, 10, "Mapa");
        anime.imprime();

        Anime anime2 = new Anime();
    }
}
