// package Q9-Functions;

public class Functions9 {

    static void modifyPrimitive(int x) {
        x = x + 10;
        System.out.println("Inside modifyPrimitive: " + x);
    }
  
    static void modifyArray(int[] arr) {
        arr[0] = arr[0] + 10;
        System.out.println("Inside modifyArray: " + arr[0]);
    }
    
    static void reassignArray(int[] arr) {
        arr = new int[]{100, 200, 300};
        System.out.println("Inside reassignArray: " + arr[0]);
    }

    public static void main(String[] args) {
        int a = 5;
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive, a = " + a); 

        int[] b = {5};
        modifyArray(b);
        System.out.println("After modifyArray, b[0] = " + b[0]); 

        reassignArray(b);
        System.out.println("After reassignArray, b[0] = " + b[0]); 
    }
    
}
