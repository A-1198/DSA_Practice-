// package Q4-Switch;
import java.util.Scanner;
public class Switch4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {   
        case '+' -> System.out.println(x1 + x2);
        case '-' -> System.out.println(x1 - x2);
        case '*' -> System.out.println(x1 * x2);
        case '/' -> System.out.println(x1 / x2);
        case '%' -> System.out.println(x1 % x2);
        default -> System.out.println("Invalid operator");
    }
    sc.close();
    }
}
