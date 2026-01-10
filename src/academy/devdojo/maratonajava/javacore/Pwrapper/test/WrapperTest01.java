package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //boxing ou autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.00;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        //Integer intW3 = new Integer("2");

    }
}
