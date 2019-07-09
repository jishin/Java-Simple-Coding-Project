import java.util.Scanner;
public class AmstrongNo {
    public static void main(String[] args) {
        int i=0, fx=0, sum=0, rep=0;
        Scanner scn =new Scanner(System.in);
        System.out.println("Eneter the no. to check for Amstrong no");
        int n = scn.nextInt();
        rep = n;
        if (n == 0)
            System.out.println("The no. is zero");
        else
            while (n!=0)
            {
                i = n%10;
                fx = i*i*i;
                sum+= fx;
                n/=10;
            }

        System.out.println("Sum of Cube of  each no. is = " + sum);

        if (sum == rep)
            System.out.println("Amstrong no.");
        else
            System.out.println("Not a Amstrong no.");

    }
}
