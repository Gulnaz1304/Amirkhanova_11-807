package primitives;

import java.util.ArrayList;
import java.util.Arrays;

      public class Main {
          public static void main(String[] args) {
              //ArrayList
              IntList list = new IntArrayList();
              list.add(40);
              list.add(43);
              list.add(30);
              IntList intList = new IntArrayList();
              System.out.println(Arrays.toString(list.toArray()));

              Iterator iter2 = list.iterator();
              int sum = 0;
              while (iter2.hasNext()) {
                  int e = iter2.next();
                  sum += e;
              }
          }
      }