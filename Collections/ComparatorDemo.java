package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class ComImp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10 > o2%10){
            return 1;       // swap
        }
        return -1;
    }

}


public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(101);
        l.add(404);
        l.add(493);
        l.add(456);
        l.add(330);

        // we want to sort the array based on the unit's digits of numbers
        ComImp obj = new ComImp();
        Collections.sort(l, obj) ;
        for(int i:l){
            System.out.println(i);
        }

        // we want to sort the array based on the ten's digits of numbers
        Collections.sort(l,(o1,o2)->{
            return (o1%100>o2%100) ? 1 : (o1%100<o2%100) ? -1:0;
        });

        for(int i:l){
            System.out.println(i);
        }
    }
}


// There is one more interface Comparable
// This interface can be implemented by the classes(eg. Student) and override comapeTo() function.
// In compareTo(Student s) ; One object s1 will initiate the process and second object is passed as parameter.
// return this.marks>s.marks ? 1 : 0;
// Use comparable interface when you are creating a custom class.