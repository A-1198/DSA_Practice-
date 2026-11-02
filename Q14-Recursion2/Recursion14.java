import java.util.Scanner;
public class Recursion14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRec2(1,n); 
        sc.close();   
    }

    static void printRec2(int i,int N) {
        if(i>N) { 
            return;
        } 
        printRec2(i+1,N);
        System.out.print(i+" ");
    }
}
