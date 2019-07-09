import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        int x = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no you wana check perfect no or not");
        int n = scn.nextInt();
        int chk = Perfect(n);
        if (chk == n)
        {
            System.out.println("Its a Perfect No.");
        }
        else
            System.out.println("Its not a Perfect No.");
    }
    public static int Perfect(int n)
    {
        int i = 1, sum =0;
        while (i<=n/2)
        {
            boolean res;
            res = IsDivisible(n,i);
            if (res == true)
            {
                sum = sum + i;
                i++;
            }
            else
                i++;
        }
        return sum;
    }
    public static boolean IsDivisible(int n, int i)
    {
        if (n%i == 0)
            return true;
        else
            return false;
    }
}
