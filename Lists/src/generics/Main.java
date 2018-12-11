package generics;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        //l.add(5); не скомпилируется
        l.add("abc");
        l.add("qwerty");
        l.add("HELlo");
        String s = l.get(0);
        MyArrayList<Integer> l2 = new MyArrayList<>();


        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (String str : l) {
            System.out.println(str.toUpperCase());
        }

    }
}
