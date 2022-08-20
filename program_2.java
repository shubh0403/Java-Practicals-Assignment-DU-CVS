/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 2:-  Java Program to Find Largest Among 3 Numbers
    
*/
import java.util.Scanner;

public class program_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Method 1 :-
        System.out.println("Largest number is : " + Math.max(Math.max(a, b), c));

        /*
         * Another method :-
         * 
         * int max = a;
         * if(b>max){
         * max =b;
         * }
         * if(c>max)
         * {
         * max = c;
         * }
         * System.out.println("Largest number is : "+max);
         * 
         */
        sc.close();
    }
}
