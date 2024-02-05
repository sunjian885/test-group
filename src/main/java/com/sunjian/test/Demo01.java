package com.sunjian.test;

public class Demo01 {
    public static void main(String[] args){
        int a = test(8);
        System.out.println(">>>>>>"+a);
    }

    public static int test(int n){
        if(n==1){
            return 1;
        }else {
           return n*test(n-1);
        }
    }

    public static void test(int ... numbers){
        int a ;
        for (int i =0;i<numbers.length;i++){
            for(int j =0;j<numbers.length;j++){

            }
        }
    }
}
