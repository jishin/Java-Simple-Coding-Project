import java.util.Scanner;
public class EvenNo_i_n_Sum {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting no.");
        int i = scn.nextInt();
        System.out.println("Enter the ending no.");
        int n = scn.nextInt();

        if (i % 2 != 0)
            i++;
        while (i <= n) {
            System.out.println(i);
            sum = sum + i;
            i += 2;
        }
        System.out.println("Sum of even no. " + sum);
    }
}