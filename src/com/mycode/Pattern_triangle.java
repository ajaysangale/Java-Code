package com.mycode;

class Triangle{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j<=1;j--){
            System.out.println("#");
        }
            for (int k = 1; k * 2 - 1 <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
    }

    }
}