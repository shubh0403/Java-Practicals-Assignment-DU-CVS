
/*
    Name - SHUBH SHARMA
    Roll Number - 2K21/CS/104

    Question 15:-   Create a class Time which has hrs and min as data members. Create a function to 
                    receive two times as objects and add them. Print the result in the same function 
   
*/
import java.util.Scanner;

public class Time {
    int hrs, min;

    Time() {
        hrs = 0;
        min = 0;
    }

    Time(int h, int m) {
        hrs = h;
        min = m;
    }

    public void addTime(Time t1, Time t2) {
        hrs = t1.hrs + t2.hrs + ((t1.min + t2.min) / 60);
        min = (t1.min + t2.min) % 60;

        System.out.println(
                "Sum of " + t1.hrs + ":" + t1.min + " and " + t2.hrs + ":" + t2.min + " is " + hrs + ":" + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time 1:");
        System.out.print("Hours : ");
        int h1 = sc.nextInt();
        System.out.print("Minutes : ");
        int m1 = sc.nextInt();

        System.out.println("Enter time 2:");
        System.out.print("Hours : ");
        int h2 = sc.nextInt();
        System.out.print("Minutes : ");
        int m2 = sc.nextInt();

        Time t1 = new Time(h1, m1);
        Time t2 = new Time(h2, m2);
        Time ob = new Time();
        ob.addTime(t1, t2);
        sc.close();
    }
}
