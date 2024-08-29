package com.mycode;

class Pattern_RightAngle{
    public static void main(String[] args) {
        int a=4;
        for (int i=1;i<=a;i++){
            for(int j=i;j<a;j++){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}