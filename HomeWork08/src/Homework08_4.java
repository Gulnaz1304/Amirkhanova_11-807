import java.util.Scanner;

public class Homework08_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < matrix[i][min]) {
                    min = j;
                }
                for (int k = 0; k < n; k++) {
                    if (matrix[k][min] > matrix[max][min]) {
                        max = k;
                    }
                }
            }
            if (i==max) {
                System.out.print(matrix[max][min] + " ");
            }
        }
    }
}
