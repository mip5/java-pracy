import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());




    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);
    System.out.println(list.size());

    list.add(1, 5);
    System.out.println(list);

    list.remove(Integer.valueOf(5));
    System.out.println(list);

    Collections.sort(list);
    System.out.println(list);
    }
}