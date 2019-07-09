import java.util.Scanner;
public class EvanNo_i_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting no.");
        int i = scn.nextInt();
        System.out.println("Enter the ending no.");
        int n = scn.nextInt();
       // EvenNo(i, n);
        if (i%2 != 0)
            i++;
        while (i<=n) {
            System.out.println(i);
            i+=2;
        }
    }
    public static void EvenNo(int i, int n) {
        int a = 0;
        System.out.println("hii");
        if (i % 2 == 0) {
            while (i <=n) {
                System.out.println(i);
                i++;
                i++;
            }
        }
        else {
            a = i + 1;
            while (a % 2 == 0 && a <=n) {
                System.out.println(a);
                a++;
                a++;
            }

        }
    }
}
