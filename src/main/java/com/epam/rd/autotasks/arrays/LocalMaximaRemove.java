package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
         int [] result = new int[array.length];
        //put your code here
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if ((i != (array.length - 1) && array[i] <= array[i + 1]) || i > 0 && array[i] <= array[i - 1]) {
             result[j] = array[i];
             j++;
            }
        }

        return Arrays.copyOf(result, j);
    }
}
