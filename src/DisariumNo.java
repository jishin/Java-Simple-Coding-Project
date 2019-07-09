import java.util.Scanner;
public class DisariumNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. whoes disarium is to be found");
        int n = scn.nextInt();
        int x = Disarium(n);
        if (x == n)
        {
            System.out.println("The no. is disarium");
        }
        else
            System.out.println("The system is not disarium");
    }
    public static int Disarium(int n)
    {
        int x= 0, val = 0, sum = 0;
        if (n == 0)
        {
            System.out.println("The no is zero");
        }
        else {
            x = Count(n);
            while (n != 0) {
                int bit = n % 10;
                val = Calcu(bit, x);
                sum = sum + val;
                x--;
                n /= 10;
            }
        }
        return sum;
    }
    public static int Count(int n)
    {
        int i = 0;
        while (n!=0)
        {
            i++;
            n/=10;
        }
        return i;
    }
    static int Calcu(int n, int p)
    {
        int val = 1;
        while (p >0)
        {
            val*= n;
            p--;
        }
        return val;
    }
}
