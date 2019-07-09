import java.util.Scanner;
public class SumOfSquareOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the digits");
        int n = scn.nextInt();
        SumOfSquare(n);
    }
    static void SumOfSquare(int n)
    {
        int i= 0 ,sum = 0;
        if (n == 0)
        {
            System.out.println("there are no digits");
        }
        else
            while (n!=0)
            {
                i = n%10;
                sum = sum + (i*i);
                n/=10;
            }

        System.out.println("The sum of square of digits are = "+ sum);
    }
}
