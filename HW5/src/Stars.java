import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("ведите строку");
        String s = n.next();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 48)&&(arr[i] <= 57)) {
                arr[i] = '*';
                System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i]);

                }
            }
        }
    }



