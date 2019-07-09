import java.util.Scanner;
public class SimpleInterest_withMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the principle");
        long p = scn.nextLong();
        System.out.println("Enter the rate");
        Double r = scn.nextDouble();
        System.out.println("Enter the time");
        Double t = scn.nextDouble();
        simpleInterest( p, r, t);
    }
    public static void simpleInterest(long p, Double r, Double t)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("The Simple Interest is = ");
        Double si = (p*r*t)/100;
        System.out.println( si);

    }
}

