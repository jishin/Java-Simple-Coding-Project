import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any integer");
        int no = scn.nextInt();
        if (no%2 == 0)
            System.out.println("No. is even");
        else
            System.out.println("No. is odd");

    }
}
