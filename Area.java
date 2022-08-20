/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 14:-   Write a program to print the area of a rectangle by creating a class named 'Area' having 
                    two methods. First method named as 'setDim' takes length and breadth of rectangle as 
                    parameters and the second method named as 'getArea' returns the area of the 
                    rectangle. Length and breadth of rectangle are entered through keyboard.
*/
import java.util.Scanner;
public class Area {
    double length, breadth;
    public void setDIm(double len, double bth) {
        length = len;
        breadth = bth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length : ");
        double len = sc.nextDouble();
        System.out.print("Breadth : ");
        double bth = sc.nextDouble();

        Area ob = new Area();
        ob.setDIm(len, bth);

        System.out.println("Area of Rectangle : " + ob.getArea());
        sc.close();
    }
}
