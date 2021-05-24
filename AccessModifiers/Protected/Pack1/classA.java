package AccessModifiers.Protected.Pack1;

import AccessModifiers.Protected.Pack2.B;

class A{
    protected void func1(){
        System.out.println("Hello from class A,Package 1");
    }
}


class SamePackageTest extends A{
    void f1(){
        // Protected member access within same package.

        A a = new A();
        a.func1();         
        SamePackageTest s = new SamePackageTest();
        s.func1();          
        A a1 = new Main();
        a1.func1();        
    }
}


class DifferentPackageTest extends B{
    void f1(){
        // B a = new B();
        // a.func1();                   
        // B a1 = new DifferentPackageTest();
        // a1.func1();  


        // Only Child Class reference in the child class is able to call protected member 
        DifferentPackageTest s = new DifferentPackageTest();
        s.func1();
    }
}


class Main extends A{
    public static void main(String[] args) {
        SamePackageTest obj1 = new SamePackageTest();
        obj1.f1();

        DifferentPackageTest obj2 = new DifferentPackageTest();
        obj2.f1();
    }
}
