package Collections;

import java.util.*;

// E ==> type of element
class Container<E>{

    public void print(E obj){
        System.out.println(obj);
    }
}


// Now container2 will not support any other class other than Number classes.
class Container2<E extends Number>{

    // ? can be any subclass of E
    public void print(ArrayList<? extends E> obj){
        System.out.println(obj);
    }


    // ? can be any super class of E
    public void print2(ArrayList<? super E> obj){
        System.out.println(obj);
    }
}



class Student{
    String name;
    Integer Rollno;
    Student(String mn, Integer r){
        name = mn;
        Rollno = r;
    }
    @Override
    public String toString() {
        return "Name: "+name+" RollNo: "+Rollno;
    }
}



class Generics{
    public static void main(String[] args) {
        Student s1 = new Student("Suryank",1);
        Container<Student> obj= new Container<>();
        obj.print(s1);

        Container2<Number> l = new Container2<>();
        ArrayList<Integer> v1 = new ArrayList<>();
        v1.add(1);
        v1.add(2);
        l.print(v1);
    }
}