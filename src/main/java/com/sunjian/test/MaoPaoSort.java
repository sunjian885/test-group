package com.sunjian.test;

import java.util.Arrays;

public class MaoPaoSort {
    public static void main(String[] args){
        int[] a = {1,99,44,532,84,23,99,34,45,23,11,23,56};

        int[] b = sort(a);
        System.out.println(Arrays.toString(b));

    }

    public static int[] sort(int[] a){
        int temp = 0;
        for(int i =0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

}
