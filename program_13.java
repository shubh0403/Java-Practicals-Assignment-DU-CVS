/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 13:- Write a program to create a class which contains a data member and a member 
                    function. The data member is given an initial value in a constructor. The member 
                    function is used to change the value of the data member as per the choice of the user. 
                    Now print the initial value and the changed value of the data member.
   
*/
import java.util.Scanner;
public class program_13 {
    // instance variable
    int data;

    // default constructor
    program_13() {
        // Initializing data member with default value - 10
        data = 10;
    }

    public void changeValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value : ");
        data = sc.nextInt();
        sc.close();
    }

    public static void main(String[] args) {
        program_13 ob = new program_13();
        System.out.println("Initial value of data member : " + ob.data);
        ob.changeValue();
        System.out.println("Value of data member after change : " + ob.data);
    }
}
