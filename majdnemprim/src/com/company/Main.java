package com.company;

public class Main {



        public static  boolean majdnemprim (int n) {
            int osztok=0;
            for(int i=2; osztok<2 && i*i<=n;i++){
                while(n% i==0){
                    n=n/i;
                    osztok++;
                }
            }
            return osztok +((n > 1) ? 1 : 0)==2;
        }
    public static void main(String[] args) {
        int hanyvan=0;
        for(int i=2; i<1000; i++){
            if(majdnemprim(i)&&majdnemprim(i+1)){
                hanyvan++;
                System.out.print(i);
                System.out.print(' ');
                System.out.print(i+1);
                System.out.println();
            }


        }
        System.out.print("Összesen ennyi van: ");
        System.out.print(hanyvan);

    }
}
