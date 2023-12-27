import java.util.Scanner;

public class Circle {

    /*  Write a Java program to create a class called "Circle"
     with an instance variable "radius."
      Include a method to calculate the area of the circle and
    a method to calculate the circumference of the circle.*/

    //Area of circle using a inheritance program
    double area;
    void area(double radius) {
        area = (3.14*radius*radius);
    }
}
    class AreaOfCir extends Circle {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius of circle");
            double radius = sc.nextDouble();
            AreaOfCir c = new AreaOfCir();
            c.area(radius);
            System.out.println("Area of circle:"+c.area);

        }
    }

