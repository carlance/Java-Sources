package algorithm.sort.quicksort;

import java.util.Arrays;

public class QuickSortTest {

	
	/*The complexity of quick sort in the average case is 0(n log(n)) and in the worst
	 * is 0(n^2)
	 */
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		
		int testArray1[] = new int[] {8,7,1,2,6,9,10,4,11};
		//int testArray2[] = new int[] {24,2,45,20,56,75,4,56,99,53,12};
		
		/*sorter.sort(testArray1);
		System.out.print("Test Array 1: ");
		sorter.printResult(testArray1);		*/
		
		System.out.println(Arrays.toString(testArray1));//unsorted
		sorter.partition(testArray1);		
		sorter.printResult(testArray1);
		
		
	}
}
