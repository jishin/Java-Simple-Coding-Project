import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter any year");
        Scanner scn = new Scanner(System.in);
        int yr = scn.nextInt();
        if (yr%400 == 0)
            System.out.println("It's a Leap year");
        else if (yr%100 == 0)
            System.out.println("It's a leap year");
        else if (yr%4 == 0)
            System.out.println("It's a leap year");
        else
            System.out.println("it's not a leap year");
    }
}
