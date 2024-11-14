package ArrayDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) throws IOException {
        //arrDeclare();
        //arrInput();
       // arrScan();
        //MaxNum();
        //Array2D();
        //Array2Dinput();
       // Array3D();
        Array3DSum();
       // Jagged2DArrayEg();
        JaggedArray();
    }
    public static void arrDeclare(){
        // int arr[3]; //Gives error
        int arr1[]={1,2,3};
        int arr3[];// only declared array but we can't use var arr3
        int[] arr2={12,8,3}; //static array in stack frame
        int[] arr4=new int[]{1,2,34}; //dynamic array on heap
        int[] arr5=new int[3]; // by default array has null value on heap

        for (int i = 0; i <arr5.length ; i++) {
            System.out.println(arr5[i]); // it will have zero op
        }
      //  int[] arr6=new int[3]{1,2,3}; // this will give Error
    }
    public static void arrInput() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        int num=Integer.parseInt(br.readLine());
        char[] arrch=new char[num];
        for (int i = 0; i <num ; i++) {
            arrch[i]= (char) br.read(); // use typecasting for char
            br.skip(1);
        }
        for (int i = 0; i <num ; i++) {
            System.out.println(arrch[i]);
        }

    }
    public static void arrScan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int num1=sc.nextInt();
        char[] arrch1=new char[num1];
        for (int i = 0; i <num1 ; i++) {
            arrch1[i]=sc.next().charAt(0); //use charAt for input in scanner
        }
        for (int i = 0; i <num1 ; i++) {
            System.out.print(arrch1[i]);
        }
    }
    public static void MaxNum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array num");
        int num=sc.nextInt();
        int[] ch1=new int[num];
        for (int i = 0; i <num ; i++) {
            ch1[i]=sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < num; i++) {
             if(max<ch1[i]){
                 max=ch1[i];
            }
        }
        System.out.println(max);
    }
    public static void Array2D(){
        //int[][] arr1=new int[][]; //Error 1st[]->row & 2nd->col
        //int[][] arr2=new int[][3];//Error
        int[][] arr3=new int[3][]; //works as we can declare row but not col
        int[][] arr4=new int[3][3];//work as both are declared
        //In 2D array we have to declare array with var without any number in index
        int[][] arr5=new int[][]{{1,2,3},{13,14,15},{23,24,25}};//Works
        for (int i = 0; i <arr5.length ; i++) {
            for (int j = 0; j <arr5.length ; j++) {
                System.out.print(arr5[i][j]+" ");
            }
            System.out.println();
          //  System.out.println(arr5.length);
        }
    }
    public static void Array2Dinput(){
        Scanner sc=new Scanner(System.in);
        char[][] ch=new char[3][3];
        for (int i = 0; i <ch.length ; i++) {
            for (int j = 0; j < ch.length ; j++) {
                ch[i][j]=sc.next().charAt(0);
            }
        }
        for (int i = 0; i <ch.length ; i++) {
            for (int j = 0; j < ch.length ; j++) {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Array3D(){
        Scanner sc=new Scanner(System.in);
        //for 2 plane array
        int[][][] arr1=new int[3][3][3];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                for (int k = 0; k < arr1.length ; k++) {
                    arr1[i][j][k]=sc.nextInt();
                }
            }
        }
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                for (int k = 0; k < arr1.length ; k++) {
                    System.out.print(arr1[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void Array3DSum(){
        int[][][] arr1=new int[][][]{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        for (int i = 0; i < 2 ; i++) {
            int sum=0;
            for (int j = 0; j < arr1[i].length ; j++) {
                for (int k = 0; k < arr1[i][j].length ; k++) {
                    sum=sum+arr1[i][j][k];
                }
               // System.out.println(arr1[i][j].length);
            }
            //System.out.println(arr1[i].length);
            System.out.println("Sum of "+i+" is "+sum);
        }
    }
    public static void Jagged2DArrayEg(){
        int[][] arr=new int[][]{{1,2},{3}}; //It will give exception as memory is dynamically allocated
        //it works when we initialize it at starting i.e by given hardcore value to each index
        int[][] arr1=new int[2][2];
        arr1[0][0]=1;
        arr1[1][1]=2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void JaggedArray(){
        //Declaration
        int[][] arr1=new int[3][];
        arr1[0]=new int[]{1,2,3}; //row 0 has 2 col
        arr1[1]=new int[1];//row 1 has 3 col
        arr1[2]=new int[5];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        //Another declaration
        int[][] arr2=new int[][]{
                {1,2,3},
                {2,4},
                {2,4,2,1,5}
        };
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }

}
