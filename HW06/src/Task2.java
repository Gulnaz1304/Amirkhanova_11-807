import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] k = s.toCharArray();
        char n = '\0';
        for (int i = 0; i < k.length; i++) {
            if(k[i]== 32) {
                k[i] = n;
            }
            System.out.print(k[i]);

        }
    }
}
