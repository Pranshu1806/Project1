package com.company;

public class while1 {
    public static void main(String[] args) {


        int i = 1;
        while (i <= 4) {
            int p=i;
            int j=1;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;

        }
    }
}