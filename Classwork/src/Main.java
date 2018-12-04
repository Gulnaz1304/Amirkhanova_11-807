import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(40);
        list.add(43);
        list.add(30);
        IntList intList = new IntArrayList();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
