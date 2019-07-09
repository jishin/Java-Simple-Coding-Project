import java.util.Scanner;
public class DisplayMultiplesOf_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting no.");
        int i = scn.nextInt();
        System.out.println("Enter the last no.");
        int n = scn.nextInt();
        Multiple(i,n);

    }
    public static void Multiple(int i, int n)
    {
        int x = 0;
        System.out.println("cc");

        if (i%5 != 0)
        {
            x = i%5;
            x = 5 -x;
            i = i+x;
            if (i%5 == 0) {
                while (i <= n) {
                    System.out.println(i);
                    i += 5;
                }
            }
        }

        else if (i%5 == 0) {
            while (i <= n) {
                System.out.println(i);
                i += 5;
            }
        }
    }
}
