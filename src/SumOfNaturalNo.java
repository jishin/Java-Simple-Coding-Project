import java.util.Scanner;
public class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Eter the natural no.");
        int n = scn.nextInt();
        Sum(n);
    }

    public static void Sum(int n) {
        int sum = 0;
        while (n >= 0)
        {
            sum = sum + n;
            n--;
        }
        System.out.println("The sum of n natural no. is " + sum);

    }


}
