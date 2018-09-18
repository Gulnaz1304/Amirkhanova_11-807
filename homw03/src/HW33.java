import java.util.Scanner;
public class HW33 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("введите длину массива");
        int dl = n.nextInt();
        int arr[] = new int[dl];
        System.out.println("введите элементы массива");
        for (int i = 0; i < dl; i++) {
            arr[i] = n.nextInt();
        }
        int k = 0;
        for (int i = 1; i < dl-1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i+1]) {

                k = k + 1;
            }

        }
        System.out.println(k);

    }
}
