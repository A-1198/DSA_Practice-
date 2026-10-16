import java.util.*;
public class BasicMaths12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        CountOfDigits(x);
        ReverseOfNumber(x);
        isPalindrome(x);
        isArmstrong(x);
        PrintAllDivisors(x);
        isPrime(x);
        int y = sc.nextInt(); 
        HCF(x,y);
        sc.close();
    } 

    static void CountOfDigits(int x) {
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        System.out.println(count);
    }

    static void ReverseOfNumber(int x) {
        int rev=0;
        while(x>0) {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);
    }

    static void isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while(x>0) {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void isArmstrong(int x) {
        int sum=0;
        int temp=x;
        while(x>0) {
            int rem=x%10;
            sum=sum+rem*rem*rem;
            x=x/10;
        }
        if(sum==temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void PrintAllDivisors(int x) {
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(x);i++) {
            if(x%i==0) {
                divisors.add(i);
                if(i!=x/i) {
                    divisors.add(x/i);
                }
            }
        }
        Collections.sort(divisors);
        for(int divisor : divisors) {
            System.out.print(divisor+" ");
            System.out.println();
        }
    }

    static void isPrime(int x) {
        int count=1;
        for(int i=2;i<=Math.sqrt(x);i++) {
            if(x%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void HCF(int x,int y) {
        while(x>0 && y>0) {
            if(x>y) {
                x=x%y;
            } else {
                y=y%x;
            }
            if(x==0) {
                System.out.println(y);
            } else  {
                System.out.println(x);
            }

        }
        }
}   

