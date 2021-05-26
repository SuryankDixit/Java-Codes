package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class HashTableDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(9);s.add(19);s.add(1);s.add(3);s.add(5);s.add(1);s.add(29);;
        System.out.print("HashSet => ");
        for(int i:s){
            System.out.print(i+" ");
        }

        System.out.println();

        Set<Integer> t = new TreeSet<>();
        t.add(1);t.add(19);t.add(3);t.add(29);t.add(5);t.add(9);t.add(1);
        System.out.print("TreeSet => ");
        for(int i:t){
            System.out.print(i+" ");
        }

        System.out.println();

        Map<String,String> m = new HashMap<>(); 
        m.put("Name","Suryank");
        m.put("Age","21");
        System.out.println(m);
        m.forEach((k,v)->System.out.println(k+" = "+v));
        
    }
}
