package com.mycode;

class Pattern1{
    public static void main(String[] args) {
        char ch='A';
        char ch1='a';

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++) {

                if(j%2==0) {
                    System.out.print(ch1+" ");
                }else {
                    System.out.print(ch+" ");
                }
                ch++;
                ch1++;
            }
            System.out.println();
        }


    }

}