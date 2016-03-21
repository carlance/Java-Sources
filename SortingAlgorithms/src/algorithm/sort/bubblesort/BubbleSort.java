package algorithm.sort.bubblesort;

import java.util.Arrays;

/*
* In bubble sort, we basically traverse the array from first
* to array_length - 1 position and compare the element with the next one.
* Element is swapped with the next element if the next element is greater.
*
* Bubble sort steps are as follows.
*
* 1. Compare array[0] & array[1]
* 2. If array[0] > array [1] swap it.
* 3. Compare array[1] & array[2]
* 4. If array[1] > array[2] swap it.
* ...
* 5. Compare array[n] & array[n+1]
* 6. if [n] > array[n+1] then swap it.
*
* After this step we will have largest element at the last index.
*
* Repeat the same steps for array[1] to array[n-1]
*  
*/
public class BubbleSort {
	
	private int temp;
	
	public void bubbleSort(int[] arr) {
	      boolean swapped = true;
	      int j = 0;
	      while (swapped) {
	       System.out.println((j+1)+"th iteration result: "+Arrays.toString(arr));
	            swapped = false;	     
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        temp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = temp;
	                        swapped = true;
	                  }
	            }                
	      }	      
	}
	
	/*public void bubbleSort(int[] arr) {
	      	 
        for(int i=0; i < arr.length - 1 ; i++){
        	 System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
            for(int j=1; j < (arr.length - i); j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
           
            
        }
	}*/	
	
	 public void printResult(int[] myArray) {
		System.out.println("Final Result: " + Arrays.toString(myArray)) ;		
	 }
}
