import java.util.*;

public class Sorting17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {  
            arr[i] = sc.nextInt();
        }
        MergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void MergeSort(int arr[], int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            MergeSort(arr, left, mid);
            MergeSort(arr, mid + 1, right);
            Merge(arr, left, mid, right);
        }
    }

    static void Merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++) {
            L[i] = arr[left + i];
        }
        for(int j=0;j<n2;j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i=0, j=0, k=left;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}