import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of terms till which the series must extend");
        int n = scn.nextInt();
        Fibonaci(n);
    }
    public static void Fibonaci(int n)
    {
        int i = 3;
        int x = 1;
        int y = 1;
        if (n == 0)
        {
            System.exit(1);
        }
        if (n == 1)
        {
            System.out.println(" 0 ");
            System.exit(1);
        }
        else if (n == 2)
        {
            System.out.println(" 0, 1");
            System.exit(1);
        }
        System.out.println("0");
        System.out.println("1");
        while (i<=n)
        {

            int z = x+y;
            System.out.println(z);
            x = y;
            y = z;
            i++;

        }
    }
}
