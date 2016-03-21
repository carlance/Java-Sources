package algorithm.tests;

public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		
		int[] array = new int[] {10,8,3,4,2,1,7,3,9}; 
		
		sorter.partition(array);
		sorter.printArray(array);
	}

}
