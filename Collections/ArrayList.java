package Collections;

import java.lang.reflect.Array;
import java.util.*;

class Arrays{
    public static void main(String[] args) {
        // Raw type declarations.
        Collection values = new  ArrayList();
        values.add(5);
        values.add(5.8);
        values.add("suryank");

        Iterator i = values.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        // Enhanced for loops
        for(Object idx:values)
            System.out.println(idx);     
            
            

        // Collection interface has no function to add element at a particular index
        Collection<Integer> v = new  ArrayList<>();
        v.add(1);
        v.add(3);
        v.add(2);
        for(int idx:v)
            System.out.println(idx);

        // List extends Collection interface internally
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(2);
        l.add(1,9);
        for(int idx:l)
            System.out.println(idx);

        
        Collections.sort(l);
        l.forEach(System.out::println);// stream Api , Uses Lambda Expression
    }
}
