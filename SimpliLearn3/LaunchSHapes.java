package project3;
import java.util.Scanner;
//find area of different shapes
//through abstraction we will enforce method overriding
abstract class Shapes{ //parent -- abstract class
double area;
abstract void getData();//used for fetching the information
abstract void calculate();//used for calculating the area
void disp() {
   System.out.println("The area is :"+area);
}
}
class Circle extends Shapes{
float r;//radius
float pi = 3.147f;
@Override
void calculate() {
   area = pi * r * r;
}
@Override
void getData() {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the radius:");
   r = sc.nextFloat();
}

}

class Square extends Shapes{  //inheritence
float side;//side
@Override
void getData() {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the side:");
   side = sc.nextFloat();
}
@Override
void calculate() {
   area = side * side;
}
}
class Rectangle extends Shapes{
float l,b;//length and breadth
@Override
void getData() {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the length:");
   l = sc.nextFloat();
   System.out.println("Enter the breadth:");
   b = sc.nextFloat();
}
@Override
void calculate() {
   area = l * b;
}
}


class Geometry{
    void usage(Shapes s) {
        s.getData();
        s.calculate();
        s.disp();
    }
}
public class LaunchSHapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle rc = new Rectangle();
        Square sq = new Square();
        
        Shapes s;
        
        s=c;//s= (address of the object which is pointed by c)
        
        s.getData();//overridden method
        s.calculate();//overridden method
        s.disp();//inherited method
        
        s=rc;//s= (address of the object which is pointed by rc)
        s.getData();//overridden method
        s.calculate();//overridden method
        s.disp();//inherited method
        
        s=sq;//s= (address of the object which is pointed by sq)
        s.getData();//overridden method
        s.calculate();//overridden method
       s.disp();//inherited method
      //  Geometry g =new Geometry();
       // g.usage(c);
       // g.usage(sq);
      //  g.usage(rc);
    }
}
