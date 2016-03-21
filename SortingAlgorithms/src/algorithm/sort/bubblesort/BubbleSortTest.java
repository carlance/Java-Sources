package algorithm.sort.bubblesort;

public class BubbleSortTest {

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		
		int Array[] = new int[] {5,3,9,7,1,8,2,4,6};
		
		bubble.bubbleSort(Array);
		bubble.printResult(Array);

	}

}
