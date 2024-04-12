package com.wipro.day03;

public class Assign4 {
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        do {
	            swapped = false;
	            for (int i = 1; i < n; i++) {
	                if (arr[i - 1] > arr[i]) {
	                    // Swap the elements
	                    int temp = arr[i - 1];
	                    arr[i - 1] = arr[i];
	                    arr[i] = temp;
	                    swapped = true;
	                }
	            }
	            // Decrease n by 1 since the last element is already in place
	            n = n - 1;
	        } while (swapped);
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 34, 12, 25};
	        bubbleSort(arr);
	        System.out.println("Sorted array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    
	}


}
