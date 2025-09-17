package com.dsa;

public class BubbleSort {

    //this is an improved version of bubble sort, but slightly improved if the array is already sorted
    public static void bubbleSortImproved(int[] arr){
        int length = arr.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }
    }

    public static void bubbleSortClassic(int[] arr){
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Before Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSortImproved(numbers);

        System.out.println("\nAfter Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
