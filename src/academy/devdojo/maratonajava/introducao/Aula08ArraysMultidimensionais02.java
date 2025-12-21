package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[5][];
        //OBS: array é objeto logo sua inicialização padrão é null;
        for(int[] arrayBase: arrayInt) {
            for (int num: arrayBase) {
                System.out.println(num);
            }
        }

        int[][] arrayInt2 = {{1,2,3}, {1,2,3}, {1,2,3,4,5}};
    }
}
