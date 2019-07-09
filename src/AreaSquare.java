import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int s = scn.nextInt();
        int ar = Area(s);
        System.out.println("Area of the square is " + ar);
    }
    static int Area(int s)
    {
        int ar = s*s;
        return ar;
    }
}
