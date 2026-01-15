package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------------------------------");
        //transformando String em objeto
        LocalDate parse1 = LocalDate.parse("20260115", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-01-15+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-01-15", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2026-01-15T14:05:49.279271");
        System.out.println(parse4);
        //dd/MM//YYYY
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parseBr = LocalDate.parse("15/01/2026", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGr = LocalDate.now().format(formatterGr);
        System.out.println(formatGr);
        LocalDate parseGr = LocalDate.parse("15.Januar.2026", formatterGr);
        System.out.println(parseGr);
    }
}
