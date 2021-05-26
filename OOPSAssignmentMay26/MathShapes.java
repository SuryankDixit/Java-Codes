/*
Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral)
*/

package OOPSAssignmentMay26;


abstract class Quadrilateral{
    int x1,y1,x2,y2,x3,y3,x4,y4;
    
    void setCoordinates(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        this.x1=x1; this.y1=y1; this.x2=x2; this.y2=y2; this.x3=x3; this.y3=y3; this.x4=x4; this.y4=y4;
    }

    abstract double area();
}

class Trapezoid extends Quadrilateral{

    int height;

    Trapezoid(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int height){
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);  
        this.height = height;           
    }

    double area(){
        double l1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double l2 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double area = ((l1+l2)*height)/2;
        return area;
    }
}

class Parallelogram extends Quadrilateral{
    
    int height;

    Parallelogram(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int height){
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);  
        this.height = height;           
    }

    double area(){
        double area = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) * height;
        return area;
    }
}

class Rectangle extends Quadrilateral{
    Rectangle(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);             
    }

    double area(){
        double area = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1=y2)) * Math.sqrt((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4));;
        return area;
    }
}

class Square extends Quadrilateral{
    Square(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);             
    }

    double area(){
        double area = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return area;
    }
}

public class MathShapes {
    public static void main(String[] args) {
        Trapezoid trap = new Trapezoid(20,20,40,20,30,30,10,30,8);
        System.out.println("Trapezoid area : "+trap.area());

        Parallelogram para = new Parallelogram(20,20,40,20,30,30,10,30,8);
        System.out.println("Parallelogram area : "+para.area());

        Rectangle rect = new Rectangle(20,20,40,20,40,30,20,30);
        System.out.println("Rectangle area : "+rect.area());

        Square sq = new Square(20,20,40,20,40,40,20,40);
        System.out.println("Square area : "+sq.area());
    }
}
