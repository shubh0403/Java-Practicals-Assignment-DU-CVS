/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 5:-  Java Program to Display All Prime Numbers from 1 to N
   
    */
import java.util.Scanner;
public class program_5 {
    public static boolean isPrime(int num) {
        int c = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Prime number between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
