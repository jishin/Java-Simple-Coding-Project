import java.util.Scanner;
public class ReverseA_no {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. to be reversed");
        int n = scn.nextInt();
        Reverse(n);
    }
    static void Reverse(int n)
    {
        int rev = 0, rem;
        while (n!=0)
        {
            rem = n%10;
            rev = rem + (rev*10);
            n/=10;
        }
        System.out.println("The reversed number is " + rev);
    }
}
