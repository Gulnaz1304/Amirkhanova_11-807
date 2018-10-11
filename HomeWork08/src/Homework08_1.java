import java.util.Scanner;

public class Homework08_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк(столбцов)");
        int n = sc.nextInt();
        int[][] matrix = new int [n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n ; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }
        boolean isMagic;
        int diaSum = 0;
        int diaSum2 = 0;
        for (int i = 0; i < n ; i++) {
            diaSum += matrix[i][i];
            diaSum2 += matrix[n - i - 1][n - i - 1];
        }
        isMagic = (diaSum == diaSum2);
        for (int i = 0; i <n ; i++) {
            int sumstolb = 0;
            int sumstrok = 0;
            for (int j = 0; j <n ; j++) {
                sumstolb += matrix[j][i];
                sumstrok += matrix[i][j];

            }
            if(sumstolb != diaSum || sumstrok != diaSum){
                isMagic = false;
            }

        }
        System.out.println(isMagic);
    }
}
