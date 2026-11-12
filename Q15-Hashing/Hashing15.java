import java.util.*;
public class Hashing15 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) {  
      arr[i] = sc.nextInt();
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    HighestAndLowestFrequency(map);
    int q = sc.nextInt();
    for(int i=0;i<q;i++){
        int x = sc.nextInt();
        if(map.containsKey(x)){
            System.out.println(map.get(x));
        } else {
            System.out.println(0);
        }
    }
    sc.close();
}  

static void HighestAndLowestFrequency(HashMap<Integer,Integer> map){
    int maxFreq = Integer.MIN_VALUE;
    int minFreq = Integer.MAX_VALUE;
    int maxNum = 0;
    int minNum = 0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() > maxFreq){
            maxFreq = entry.getValue();
            maxNum = entry.getKey();
        }
        if(entry.getValue() < minFreq){
            minFreq = entry.getValue();
            minNum = entry.getKey();
        }
    }
    System.out.println("Highest Frequency: " + maxNum + "->" + maxFreq);
    System.out.println("Lowest Frequency: " + minNum + "-> " + minFreq);
}
}
