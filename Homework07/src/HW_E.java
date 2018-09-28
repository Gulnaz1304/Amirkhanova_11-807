import java.util.Scanner;

public class HW_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int otv = sum(k);
        System.out.println(otv);
    }
    static int sum(int k) {
        if(k == 0){
            return 0;
        }else{
         return (k%10 + sum(k/10));
        }
    }
}
