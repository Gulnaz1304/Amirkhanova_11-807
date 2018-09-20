import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double l = 0, p;
        String s = "";
        String f = "yes";
        while (true) {
            if(f.equals("yes")) {
                System.out.println("Введите первое число");
                l = n.nextDouble();
            }
            System.out.println("Введите оператор");
            s = n.next();
            System.out.println("Введите второе число");
            p = n.nextDouble();

            switch (s) {
                case "*":
                    l = l * p;
                    break;
                case "+":
                    l = l + p;
                    break;
                case "-":
                    l = l - p;
                    break;
                case "/":
                    l = l / p;
                    break;
            }

            System.out.println(l);
            System.out.println("Сбросить результат?");
            f = n.next();



        }
    }
}