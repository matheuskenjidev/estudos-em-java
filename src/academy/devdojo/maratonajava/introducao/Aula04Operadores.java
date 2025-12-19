package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero2 - numero1);
        System.out.println(numero1 + numero2);
        System.out.println(numero2 / numero1);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        //operadores booleanos > < <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && || !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double saldoContaCorrente = 5001.0;
        double valorContaPoupanca = 200.0;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = saldoContaCorrente >= valorPlaystation || valorContaPoupanca >= valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        //operadores de atribuição
        // =, += -= *= %=
        double bonus = 1800;
        bonus += 1000; //  bonus = bonus + 1000
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;//1
        System.out.println(contador++);//1
        System.out.println(contador);//2
    }
}
