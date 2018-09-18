import java.util.Scanner;
public class HW31 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];


        }
        double sr = sum/n;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>sr){
                k++;

            }

        }


        System.out.println(sr + " " + k);

    }
}

