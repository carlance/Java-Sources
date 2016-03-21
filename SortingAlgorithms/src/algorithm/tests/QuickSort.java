package algorithm.tests;

public class QuickSort {
	
	private int[] myArray;
	private int length;
	
	public void partition(int[] array){
		if(array == null || array.length == 0){
			return;
		}
		
		else{
			this.myArray = array;
			length = array.length;
			quickSort(0, length - 1);
		}
	}
		
		private void quickSort(int low,int high) {
			
			int i = low;
			int j = high;
			int pivot = myArray[low + (high-low)/2];
			
			while(i <= j){
				
				while(myArray[i] < pivot)
					i++;
				
				while(myArray[j] > pivot)
					j--;
				
				if(i <= j){
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;			
					i++;
					j--;
				}
								
		}
			if(low < j)
				quickSort(low,j);
			if(i < high)
				quickSort(i,high);
	}
		
		public void printArray(int[] array){
			
			System.out.print("End Result: ");
				for(int i: array){
					System.out.print(i + " ");
				}
		}

}
