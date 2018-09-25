import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kol = sc.nextInt();
        int arr[] = new int[kol];
        for (int i = 0; i < kol; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 1;
        int max=0;
        for (int i = 0; i < kol-1; i++) {

            if (arr[i] == arr[i + 1]) {
                k++;
            }else{
                if(k > max){
                    max = k;
                    k = 1;
                }
            }
        }
        if(max == 1) {
            System.out.println("повторяющихся цифр нет");
        }else {
            System.out.println(max);
        }
    }
}
