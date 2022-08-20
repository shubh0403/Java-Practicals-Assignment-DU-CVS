/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 3:-  Java Program to Find LCM of 2 numbers
    
*/

import java.util.Scanner;

public class program_3 {

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The LCM of " + num1 + " and " + num2 + " : " + ((num1 / gcd(num1, num2)) * num2));
        sc.close();
    }
}
