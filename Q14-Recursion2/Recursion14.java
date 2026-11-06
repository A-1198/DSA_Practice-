import java.util.Scanner;
public class Recursion14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfNumbers(n,0);
        Factorial(n);
        int arr[] = new int[]{1,2,3,4,5};
        ReverseArray(arr,0);
        System.out.print("Reversed Array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String str = sc.next();
        System.out.println(isPalindrome(str, 0, str.length()-1));
        System.out.println(Fibonacci(n));
        sc.close();   
    }

    static void SumOfNumbers(int n, int Sum) {
        if(n == 0) {
            System.out.println(Sum);
            return;
        }
        SumOfNumbers(n-1, Sum+n);
    }

    static void Factorial(int n) {
        int factorial = 1;
        factorial = FactorialHelper(n, factorial);
        System.out.println(factorial);  
    }

    static int FactorialHelper(int n, int factorial) {
        if(n == 1) {
            return factorial;
        }
        factorial *= n;
        return FactorialHelper(n-1, factorial);
    }

    static void ReverseArray(int arr[],int i) {
        if(i>=arr.length/2) {
            return;
        }
        Swap(arr, i, arr.length-i-1);
        ReverseArray(arr,i+1);
    }

    static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static boolean isPalindrome(String str, int start, int end) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }

    static int Fibonacci(int n) {
       if(n<=1) return n;
       return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
