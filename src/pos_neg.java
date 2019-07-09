import java.util.Scanner;
public class pos_neg {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter an integer value");
            int no = scn.nextInt();
            if (no >= 0)
                System.out.println("No. is +ve");
            else
                System.out.println("no. is negative");


        }

}
