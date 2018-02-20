package com.company;

public class Main {
        public static boolean kprime(int n, int k) {
        int f = 0;
        for (int p = 2; f < k && p * p <= n; p++) {
            while (n % p == 0) {
                n /= p;
                f++;
            }
        }
        return f + ((n > 1) ? 1 : 0) == k;
        }

    public static void main(String[] args) {
        int hanyvan=0;
        for(int i=2; i<100; i++){
            if(kprime(i,2)&&kprime(i+1, 2)){
                hanyvan++;
                System.out.print(i);
                System.out.print(' ');
                System.out.print(i+1);
                System.out.println();
            }


        }
        System.out.print(hanyvan);

    }
}
