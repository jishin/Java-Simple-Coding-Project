import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = scn.nextInt();
        double area = Area(r);
        System.out.println("Area of circle is " + area);

    }
    static double Area(int r)
    {
        int ar = (22*r*r)/7;
        return ar;
    }
}
