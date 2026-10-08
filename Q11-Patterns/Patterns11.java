import java.util.Scanner;

public class Patterns11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Print1(n);
        //Print2(n);
        //Print3(n);
        //Print4(n);
        //Print5(n);
        //Print6(n);
        //Print7(n);
        //Print8(n);
        //Print9(n);
        //Print10(n);
        //Print11(n);
        //Print12(n);
        //Print13(n);
        //Print14(n);
        //Print15(n);
        //Print16(n);
        //Print17(n);
        Print18(n); 
        sc.close();
    }

    static void Print1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void Print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Print7(int n) {
        for (int i = 0; i < n; i++) {
           for(int j=0;j<n-i;j++){
            System.out.print(" ");
           }
            for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
               }
            System.out.println();
        }
    }

    static void Print8(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void Print9(int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Print10(int n) {
        for(int i=0;i<=2*n-1;i++) {
            int stars=i;
            if(i>=n) {
                stars=2*n-i;
            }
            for(int j=0;j<stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Print11(int n) {
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void Print12(int n) {
        int space=2*(n-1);
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=0;j<space;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }

    static void Print13(int n) {
        int num=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    static void Print14(int n) {
        for(int i=0;i<n;i++) {
            for(char j='A';j<='A'+i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Print15(int n) {
        for(int i=0;i<n;i++) {
            for(char j='A';j<='A'+n-i-1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Print16(int n) {
        char ch='A';
        for(int i=0;i<n;i++) {
            for(char j=0;j<=i;j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }

    static void Print17(int n) {
        for (int i = 0; i < n; i++) {
            int mid = (2 * i + 1) / 2;
            char ch = 'A';

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < mid) {
                    ch++;
                } else {
                    ch--;
                }
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Print18(int n) {
    for (int i = 0; i < n; i++) {
        char ch = (char) ('E' - i);
        for (char j = ch; j <= 'E'; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
}

