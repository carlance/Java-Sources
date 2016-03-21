package algorithm.tests;

import java.util.Arrays;

public class BubbleSort {
		
	
	public void bubbleSort(int[] array){
		
		boolean swapped = true;
		int j = 0;
		int temp;
		
		while(swapped){
			swapped = false;
			j++;
			
			for(int i = 0; i < array.length - j; i++){
				if(array[i] > array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swapped = true;
				}
			}
		}		
				
	}
	
	public void printResult(int[] myArray){
		System.out.println("Sorted array: " + Arrays.toString(myArray));
		
	}

}
