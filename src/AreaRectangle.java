import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rect.");
        int l = scn.nextInt();
        int b = scn.nextInt();
        Area(l, b);
    }
    public static void Area(int l, int b)
    {
        int ar = l*b;
        System.out.println("Area of rectangle is = " + ar);
    }
}
