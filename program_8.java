
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 8:- Java Program to Find the Largest Element in an Array
    
*/
import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking integer 1D-array as input from user

        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
        }
        System.out.println("The largest element in the predefined array is " + max);
        sc.close();
    }
}
