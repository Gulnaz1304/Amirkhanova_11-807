
public class HW_F {
    public static void main(String[] args) {
        System.out.println(obratno(543));
    }

    public static int obratno(int k) {

        if (k < 10) {
            return k;
        } else {
            System.out.println(k % 10 + " ");
            return obratno(k / 10);
        }

    }

}
