import java.util.Scanner;
public class HappyNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to check for Happy or not");
        int n = scn.nextInt();
        Happy(n);
    }
    public static void Happy(int n)
    {
        int i = 0, sum = 0;

         while (n > 9) {
             while (n != 0) {
                 i = n % 10;
                 sum = sum + (i * i);
                 n /= 10;
             }
             n = sum;
             sum = 0;
         }
        if (n == 1) {
            System.out.println("Its a Happy No");
        }
        else
            System.out.println("Its not a Happy No");

    }
}
