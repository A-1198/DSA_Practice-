import java.util.*;
public class Sorting16 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) {  
      arr[i] = sc.nextInt();
    }
    SelectionSort(arr);
    System.out.println();
    BubbleSort(arr);
    System.out.println();
    InsertionSort(arr);
    sc.close();
  }

  static void SelectionSort(int arr[]) {
    for(int i=0;i<=arr.length-2;i++) {
      int minIdx = i;
      for(int j=i;j<=arr.length-1;j++) {
        if(arr[j]<arr[minIdx]) {
          int temp = arr[j];
          arr[j]=arr[minIdx];
          arr[minIdx]=temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+ " ");
    }
  }

  static void BubbleSort(int arr[]) {
    for(int i=arr.length-1;i>=1;i--) 
      {
      int Swap=0;
      for(int j=0;j<=i-1;j++) {
        if(arr[j]>arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          Swap=1;
        }
      }
      if(Swap==0) break;
    }
    for(int i : arr) {
        System.out.print(i+" ");
      }
  }

  static void InsertionSort(int arr[]) {
    for(int i=0;i<=arr.length-1;i++) {
      int j=i;
      while(j>0 && arr[j-1]>arr[j]) {
        int temp = arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
      }
    }
    for(int a : arr) {
      System.out.print(a+" ");
    }
  }
}