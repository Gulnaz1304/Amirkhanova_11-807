import java.util.Scanner;
public class HW35 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("введите длину массива");
        int dl = n.nextInt();
        int arr[] = new int[dl];
        System.out.println("введите элементы массива");
        for (int i = 0; i < dl; i++) {
            arr[i] = n.nextInt();
        }
        String s = new String();
        for (int i = 0; i < dl; i++) {
            s = s + arr[i];
        }
        System.out.print(s);
    }


}
