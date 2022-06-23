package com.juliuskrah;

public class ReverseArray {

    /**
     * Reverse an array in-place without using constant space
     * 
     * @implNote time complexity 0(n) - linear time
     * @param arr array to reverse
     * @return reversed array
     */
    public static int[] reverseInplace(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size -i - 1] = temp;
        }
        return arr;
    }
}
