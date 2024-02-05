package com.sunjian.method;


import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int total = add(1,2);
        System.out.println(total);
        double sum = add(2.3,4.4,5.5,100.2,3.78);
        System.out.println(sum);
    }
    public static int add(int a,int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }

    public static double add (double... i){
        double result = i[0];
        for(int j=0;j<i.length;j++){
            if(i[j]>result){
                result=i[j];
            }
        }
        return result;
    }

}
