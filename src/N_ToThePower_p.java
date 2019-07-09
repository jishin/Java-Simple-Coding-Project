import java.util.Scanner;
public class N_ToThePower_p {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = scn.nextInt();
        System.out.println("Enter the value of power");
        int p = scn.nextInt();
        int val = Power(n, p);
        System.out.println("the value of " + n + "to the power of" + p + " = " + val);
    }
    static int Power(int n, int p)
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
