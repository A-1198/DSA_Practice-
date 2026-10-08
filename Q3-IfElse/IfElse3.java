// package Q3-IfElse;
import java.util.Scanner;
public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("The no is positive");
        } else if (x < 0) {
            System.out.println("The no is negative");
        } else {
            System.out.println("The no is zero");
        }
    }
}
