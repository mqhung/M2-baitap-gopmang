package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr1 = {1,2,3,4,5,6};
        int []arr2 = {7,8,9,10,11,12};
        int []mergeArray;
        mergeArray = merge(arr1,arr2);
        System.out.println("Array after merge is: ");
        for (int i =0; i<mergeArray.length;i++){
            System.out.print(mergeArray[i] +"\t");
        }
    }
    public static int[] merge(int []array1, int []array2){
        int []arrayMerge = new int[array1.length+array2.length];
        for (int i = 0; i < arrayMerge.length;i++){
            if (i<array1.length){
                arrayMerge[i] = array1[i];
            } else {
                arrayMerge[i] = array2[i-array1.length];
            }
        }
        return arrayMerge;
    }
}
