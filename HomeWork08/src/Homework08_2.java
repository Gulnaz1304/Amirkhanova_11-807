import java.util.Scanner;

public class Homework08_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк:");
        int n = sc.nextInt();
        System.out.println("Введите число столбцов:");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxstrok = 0;
        for (int i = 0; i < n ; i++) {
            int sumstrok = 0;
            for (int j = 0; j < m ; j++) {
                sumstrok += matrix[i][j];

            }
            if (sumstrok >= maxstrok){
                maxstrok = sumstrok;
            }

        }
        int maxstolb = 0;
        for (int i = 0; i < m ; i++) {
            int sumstolb = 0;
            for (int j = 0; j < n ; j++) {
                sumstolb += matrix[j][i];
            }
            if(sumstolb >= maxstolb){
                maxstolb = sumstolb;
            }

        }
        System.out.println(maxstrok);
        System.out.println(maxstolb);
    }

}