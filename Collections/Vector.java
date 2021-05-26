package Collections;

import java.util.*;

class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        System.out.println(v.capacity());   //10
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v.add(11);
        v.add(12);
        v.add(13);
        // vector doubles the capacity as soon as it fills its all boxes;   // Thread Safe  // slow
        // 10->20->40->80
        // ArrayList doubles the suize by 50%   // Not Thread Safe  // Fast
        System.out.println(v.capacity());   //10
        for(int i:v)
            System.out.println(i);
    }
}
