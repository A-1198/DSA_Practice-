// package Q8-WhileLoop;
import java.util.Scanner;
public class WhileLoop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while(i <= 20) {
            System.out.println(x + " * " + i + " = " + (x * i));
            i++;
        }
        sc.close();
    }
    
}
