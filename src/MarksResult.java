import java.util.Scanner;
public class MarksResult {
    public static void main(String[] args) {
        double m1, m2, m3, m4;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks of four subjects");
        m1 = scn.nextDouble();
        m2 = scn.nextDouble();
        m3 = scn.nextDouble();
        m4 = scn.nextDouble();
        getResult(m1, m2, m3, m4);
    }
    public static void getResult(double m1, double m2, double m3, double m4)
    {
        double perc = 00;
        if (m1<35 || m2<35 || m3<35 || m4<4)
        {
            System.out.println("Student failed");
        }
        else
            perc = ((m1+m2+m3+m4)*100)/400;

            if (perc > 80)
            {
                System.out.println("Distinction");
            }
            else if (perc > 60)
            {
                System.out.println("First Class");
            }
            else if (perc > 50)
            {
                System.out.println("Second Class");
            }
            else
                System.out.println("Fail");
    }
}
