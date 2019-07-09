import java.util.Scanner;
public class PrintNo_i_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting no.");
        int i = scn.nextInt();
        System.out.println("Enter the last no.");
        int n = scn.nextInt();
        Print(i, n);
    }
    public static void Print(int i, int n)
    {
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
