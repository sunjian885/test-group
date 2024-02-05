package com.sunjian.test;

public class test {
    static int a =1;
    public static void main(String[] args) {
        int[] a = {1,3,4,5};
        for (int i : a) {
            System.out.println(">>>>>>>"+i);
        }
        for(int i =0;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int[][] arrary = new int[11][11];
    }

    public static int add(int a,int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }
//    public static test (){
//
//    }
}
