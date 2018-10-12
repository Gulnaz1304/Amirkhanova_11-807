import java.util.Scanner;

// вариант 3
public class ClassTestTask01 {
    public static void main(String[] args) {
        int[][] matrix =  {{1,6,4,2},
                           {7,1,0,4},
                           {8,3,6,5}}; // вводим вручную  прямоугольную матрицу
        int[] arr = {116,42, 23, 99, 37}; // вводим массив чисел
        for (int i = 0; i < arr.length ; i++) {
            int number_create;
            for (;arr[i] > 0;arr[i]/=10){
                number_create = arr[i]%10;
                for (int j = 0; j <matrix.length ; j++) {
                    for (int k = 0; k <matrix[0].length ; k++) {
                        if( matrix[j][k] == number_create){
                            check( matrix[j][k], number_create)


                    }

                }
                }
            }
    }
    }
    public static boolean check(int matrix[][],int number_create){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                while( matrix[i][j+1] == number_create)
            {

                }

            }
        }
    }
}