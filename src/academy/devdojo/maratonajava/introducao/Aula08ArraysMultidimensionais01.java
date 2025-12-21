package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5,6 meses
        //31,28,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;
        dias[2][0] = 1;
        dias[2][1] = 2;
        dias[2][2] = 3;
        System.out.println(dias[0]);

        for (int i = 0; i < dias.length; i++) {

            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------");
        for(int[] arr: dias) {
            for (int num: arr) {
                System.out.println(num);
            }
        }
    }
}
