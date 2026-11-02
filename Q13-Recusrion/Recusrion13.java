import java.util.Scanner;
public class Recusrion13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Print1(n);
        printName(1,n);
        print2(1,n);
        System.out.println();
        print3(n,n);
        System.out.println();
        printRec1(n,n);
        System.out.println();
        printRec2(1,n); 
        sc.close();   
    }

    static void Print1(int n) {
        if(n==0) {
            return;
        }
        Print1(n-1);
        System.out.println(n);
    }

    static void printName(int i,int N) {
        if(i>N) {
            return;
        }
        System.out.println("Hello");
        printName(i+1,N);
    }
 
    static void print2(int i,int N) {
        if(i>N) {
            return;
        }
        System.out.print(i+" ");
        print2(i+1,N);
    }

    static void print3(int i,int N) {
        if(i<=0) {
            return;
        }
        System.out.print(i+" ");
        print3(i-1,N);
    }

    static void printRec1(int i,int N) {
        if(i<=0) {
            return;
        } 
        printRec1(i-1,N);
        System.out.print(i+" ");
    }

    static void printRec2(int i,int N) {
        if(i>N) { 
            return;
        } 
        printRec2(i+1,N);
        System.out.print(i+" ");
    }
 }