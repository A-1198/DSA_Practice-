import java.util.Scanner;
public class Recusrion13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print1(n);
    }

    static void Print1(int n) {
        if(n==0) {
            return;
        }
        Print1(n-1);
        System.out.println(n);
    }
}