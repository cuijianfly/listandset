package com.fly.datasort;

import java.util.Arrays;

public class DataSort {
    //冒泡
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
                System.out.println(Arrays.toString(array));

            }
            System.out.println("===================");
        }
        return array;
    }
    //选择复制
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
            System.out.println("===================");
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9,2,5,4};
        //bubbleSort(array);
        selectionSort(array);

    }
}
