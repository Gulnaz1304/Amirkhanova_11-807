package objects;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList oal = new ObjectArrayList();
        oal.add("abc");
        oal.add("hello");
        oal.add("qwerty");
        oal.add("0987");
        int i1 = 6;
        oal.add(i1);
        int x = (int) oal.get(4);
        String s = (String) oal.get(2);

    }
}