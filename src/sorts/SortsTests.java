import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class SortsTests {
	int index;
	Integer[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	Integer[] arr2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
	Integer[] arr3 = {-1, -4, -7, 1, 6, 0, -400, -3, 200, 0};
	Integer[] arr4 = {0 , 5, 0, 10, 0, -5, 0, -10, 0, -15};
	Integer[] arr5 = {7};
	
	Integer[] unsortedArr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	Integer[] unsortedArr2 = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
	Integer[] unsortedArr3 = {-1, -4, -7, 1, 6, 0, -400, -3, 200, 0};
	Integer[] unsortedArr4 = {0 , 5, 0, 10, 0, -5, 0, -10, 0, -15};
	Integer[] unsortedArr5 = {7};
	
	Integer[] sortedArr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	Integer[] sortedArr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	Integer[] sortedArr3 = {-400, -7, -4, -3, -1, 1, 6, 0, 0, 200};
	Integer[] sortedArr4 = {-15, -10, -5, 0, 0, 0, 0, 0, 5, 10};
	Integer[] sortedArr5 = {7};
	
	List<SortEvent<Integer>> sortEventsOne = new LinkedList<SortEvent<Integer>>();
	List<SortEvent<Integer>> sortEventsTwo = new LinkedList<SortEvent<Integer>>();
	List<SortEvent<Integer>> sortEventsThree = new LinkedList<SortEvent<Integer>>();
	List<SortEvent<Integer>> sortEventsFour = new LinkedList<SortEvent<Integer>>();
	List<SortEvent<Integer>> sortEventsFive = new LinkedList<SortEvent<Integer>>();
	@SuppressWarnings("deprecation")
	@Test
	public void selectionSortTest(){
		sortEventsOne = selectionSort(arr1);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr1);
        }
		assertEquals(unsortedArr1, sortedArr1);
		sortEventsTwo = selectionSort(arr2);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr2);
        }
		assertEquals(unsortedArr2, sortedArr2);
		sortEventsThree = selectionSort(arr3);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr3);
        }
		assertEquals(unsortedArr3, sortedArr3);
		sortEventsFour = selectionSort(arr4);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr4);
        }
		assertEquals(unsortedArr4, sortedArr4);
		sortEventsFive = selectionSort(arr5);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr5);
        }
		assertEquals(unsortedArr5, sortedArr5);
	}
	@Test
	public void insertionSortTest(){
		sortEventsOne = insertionSort(arr1);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr1);
        }
		assertEquals(unsortedArr1, sortedArr1);
		sortEventsTwo = insertionSort(arr2);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr2);
        }
		assertEquals(unsortedArr2, sortedArr2);
		sortEventsThree = insertionSort(arr3);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr3);
        }
		assertEquals(unsortedArr3, sortedArr3);
		sortEventsFour = insertionSort(arr4);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr4);
        }
		assertEquals(unsortedArr4, sortedArr4);
		sortEventsFive = insertionSort(arr5);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr5);
        }
		assertEquals(unsortedArr5, sortedArr5);
	}
	@Test
	public void bubbleSortTest(){
		sortEventsOne = bubbleSort(arr1);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr1);
        }
		assertEquals(unsortedArr1, sortedArr1);
		sortEventsTwo = bubbleSort(arr2);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr2);
        }
		assertEquals(unsortedArr2, sortedArr2);
		sortEventsThree = bubbleSort(arr3);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr3);
        }
		assertEquals(unsortedArr3, sortedArr3);
		sortEventsFour = bubbleSort(arr4);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr4);
        }
		assertEquals(unsortedArr4, sortedArr4);
		sortEventsFive = bubbleSort(arr5);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr5);
        }
		assertEquals(unsortedArr5, sortedArr5);
	}
	@Test
	public void mergeSortTest(){
		sortEventsOne = mergeSort(arr1);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr1);
        }
		assertEquals(unsortedArr1, sortedArr1);
		sortEventsTwo = mergeSort(arr2);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr2);
        }
		assertEquals(unsortedArr2, sortedArr2);
		sortEventsThree = mergeSort(arr3);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr3);
        }
		assertEquals(unsortedArr3, sortedArr3);
		sortEventsFour = mergeSort(arr4);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr4);
        }
		assertEquals(unsortedArr4, sortedArr4);
		sortEventsFive = mergeSort(arr5);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr5);
        }
		assertEquals(unsortedArr5, sortedArr5);
	}
	@Test
	public void quickSortTest(){
		sortEventsOne = quickSort(arr1);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr1);
        }
		assertEquals(unsortedArr1, sortedArr1);
		sortEventsTwo = quickSort(arr2);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr2);
        }
		assertEquals(unsortedArr2, sortedArr2);
		sortEventsThree = quickSort(arr3);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr3);
        }
		assertEquals(unsortedArr3, sortedArr3);
		sortEventsFour = quickSort(arr4);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr4);
        }
		assertEquals(unsortedArr4, sortedArr4);
		sortEventsFive = quickSort(arr5);
		index = 0; 
		while (index < events.size()) {
            SortEvent<Integer> e = events.get(index++);
            e.apply(unsortedArr5);
        }
		assertEquals(unsortedArr5, sortedArr5);
	}
}
