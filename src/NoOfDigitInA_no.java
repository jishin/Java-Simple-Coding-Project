import java.util.Scanner;
public class NoOfDigitInA_no {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number who's digits are to be counted ");
        long n = scn.nextLong();
        Count(n);
    }
    public static void Count(long n)
    {
        int count = 0;
        //int x= 0;
        if (n == 0)
        {
            System.out.println("the no. of digits are = " + count);
        }
        else
            while (n != 0)
        {

            count++;
            n/= 10;
        }
        System.out.println(count);
    }
}
