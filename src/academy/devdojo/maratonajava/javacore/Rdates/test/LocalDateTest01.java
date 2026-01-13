package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2026, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        System.out.println("agora: " + agora);
        System.out.println(date);

        System.out.println(date.getYear());//retorna o ano
        System.out.println(date.getMonth());//retorna o mês
        System.out.println(date.getMonth().getValue());//retorna o valor do mês
        System.out.println(date.getDayOfWeek());//retorna o dia da semana em ENUM
        System.out.println(date.lengthOfMonth());//retorna a quantidade de dias do mês
        System.out.println(date.isLeapYear());//verifica se é um ano bisexto
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
    }
}
