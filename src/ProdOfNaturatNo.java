import java.util.Scanner;
public class ProdOfNaturatNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Eter the natural no.");
        int n = scn.nextInt();
        Prod(n);
    }

    public static void Prod(int n) {
        int prod = 1;
        while (n >= 1)
        {
            prod = prod * n;
            n--;
        }
        System.out.println("The prod of n natural no. is " + prod);

    }
}
