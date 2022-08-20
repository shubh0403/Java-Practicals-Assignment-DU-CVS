/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 6:-  Java Program to Check Leap Year
    */
import java.util.Scanner;
public class program_6 {
    public static boolean isLeap(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else {
                leap = true;
            }
        }
        else {
            leap = false;}
        return leap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();
        if (isLeap(year)) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }
        sc.close();
    }
}
