import java.util.Scanner;
public class EvenDigitsInNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no.");
        long n = scn.nextLong();
        Evenno(n);
    }
    public static void Evenno(long n)
    {
        long i = 0;
        int count = 0;
        if (n == 0)
            System.out.println("There are no even no.");

        else
            while (n !=0)
            {
                i = n%10;
                if (i%2 == 0)
                {
                    System.out.println("Even no = " + i);
                    count++;
                }
                n/=10;

            }
        System.out.println("Total even no. are = " + count);
    }
}
