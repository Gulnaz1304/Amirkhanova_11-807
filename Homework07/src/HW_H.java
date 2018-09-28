import java.util.Scanner;

public class HW_H {
    public static void main(String[] args) {
        int n = prostoe(12,2);
        if(n==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
    static int prostoe(int k, int n ) {
        if(k==2){
            return 1;
        }else if (k < 2){
            return 1;

        }else if(k % n == 0){
            return 0;

        }else if(k < n){
            return prostoe(k,n+1);
        }else{
            return 1;
        }

    }
}
