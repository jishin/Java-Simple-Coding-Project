import java.util.*;
public class SimpleInterest_withOutMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amt");
        long p = scn.nextLong();
        System.out.println("Enter the rate");
        double r = scn.nextDouble();
        System.out.println("Enter the time");
        double t = scn.nextDouble();
        double SI = (p*r*t)/100;
        System.out.println("Simple Interest for the amt " + p + "is " + SI);
    }
}