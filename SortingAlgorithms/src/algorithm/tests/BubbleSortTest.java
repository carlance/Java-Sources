package algorithm.tests;

public class BubbleSortTest {
	
		public static void main(String[] args){
			BubbleSort sorter = new BubbleSort();
			int[] array = new int[] {11,3,1,10,5,6,4,8,9};
			sorter.bubbleSort(array);
			sorter.printResult(array);
		
		}
}
