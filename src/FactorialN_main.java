import java.util.Scanner;
public class FactorialN_main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter th No. whoes fact is to be found");
        int n = scn.nextInt();
        FactorialN f = new FactorialN();
        int x =  f.getFact(n);
        System.out.println("The factorial of" + n + " is = " + x);
    }
}
