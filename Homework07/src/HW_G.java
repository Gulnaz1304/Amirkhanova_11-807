public class HW_G {
    public static void main(String[] args) {
        System.out.println(fromTheLeftToTheRight(576));

    }

    public static int fromTheLeftToTheRight(int k) {
        if (k < 10) {
            return k;
        } else {
            System.out.println(fromTheLeftToTheRight(k / 10));
            return fromTheLeftToTheRight(k%10);



        }

    }
}
