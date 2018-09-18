import java.util.Scanner;
public class HW32 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("введите количество элементов в массиве");
        int raz = n.nextInt();
        int arr[] = new int[raz];
        System.out.println("ведите элементы массива");
        for (int i = 0; i < raz; i++) {
            arr[i] = n.nextInt();
        }
        int max1 = 0;
        for (int i = 0; i < raz; i++) {
            if (Math.abs(arr[i]) > Math.abs(max1)) {
                max1 = arr[i];

            }
        }
        System.out.println(max1);

    }
}
