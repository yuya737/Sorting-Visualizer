package edu.grinnell.sortingvisualizer.sorts;
import edu.grinnell.sortingvisualizer.events.SortEvent;
import edu.grinnell.sortingvisualizer.events.CopyEvent;
import edu.grinnell.sortingvisualizer.events.CompareEvent;
import edu.grinnell.sortingvisualizer.events.SwapEvent;

import java.util.LinkedList;
import java.util.List;



public class Sorts {
	public static <T extends Comparable<T>> void swap(T[] arr, int i, int j){
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static <T extends Comparable<T>> List<SortEvent<Integer>> selectionSort(Integer[] arr){
		List<SortEvent<Integer>> SortEvents = new LinkedList<SortEvent<Integer>>();
		CompareEvent<Integer> CompareEvents = new CompareEvent();
		SwapEvent<Integer> SwapEvents = new SwapEvent();
		for(int i = 0; i < arr.length - 1; i++){
			int lowestIndex = i;
			for(int j = i; j < arr.length; j++){
				CompareEvents.storeInts(j, lowestIndex);
				SortEvents.add(CompareEvents);
				CompareEvents = new CompareEvent();
				if(0 > arr[j].compareTo(arr[lowestIndex])){
					lowestIndex = j;
				}
			}
			SwapEvents.storeInts(i, lowestIndex);
			SortEvents.add(SwapEvents);
			SwapEvents = new SwapEvent();
			swap(arr, i, lowestIndex);
		}
		
		return SortEvents;
	}
	public static <T extends Comparable<T>> List<SortEvent<Integer>> insertionSort(T[] arr){
		SwapEvent<Integer> SwapEvents = new SwapEvent();
		CompareEvent<Integer> CompareEvents = new CompareEvent();
		List<SortEvent<Integer>> SortEvents = new LinkedList<SortEvent<Integer>>();
		for (int i = 1; i < arr.length; i++) {
			
			for (int j = i; j > 0 && (0 < arr[j-1].compareTo(arr[j])) ; j--) {
				CompareEvents.storeInts(j - 1, j);
				SortEvents.add(CompareEvents);
				CompareEvents = new CompareEvent();
				SwapEvents.storeInts(j, j - 1);
				SortEvents.add(SwapEvents);
				SwapEvents = new SwapEvent();
				swap(arr, j, j-1);
			}
		}
		return SortEvents;
	}
		public static <T extends Comparable<T>> List<SortEvent<Integer>> bubbleSort(T[] arr){
		int n = arr.length;
		List<SortEvent<Integer>> SortEvents = new LinkedList<SortEvent<Integer>>();
		SwapEvent<Integer> SwapEvents = new SwapEvent();
		CompareEvent<Integer> CompareEvents = new CompareEvent();
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i - 1; j++){
				CompareEvents.storeInts(j, j + 1);
				SortEvents.add(CompareEvents);
				CompareEvents = new CompareEvent();
				if(arr[j].compareTo(arr[j + 1]) > 0){
					SwapEvents.storeInts(j, j + 1);
					SortEvents.add(SwapEvents);
					SwapEvents = new SwapEvent();
					swap(arr, j, j + 1);
				}
			}
		}
		return SortEvents;
	}
	public static <T extends Comparable<T>>  List<SortEvent<Integer>> mergeSort(Integer[] arr){
		List<SortEvent<Integer>> SortEvents = new LinkedList<SortEvent<Integer>>();
		return mergeSortHelper(arr, 0, arr.length-1, SortEvents);
	}
	
	
	private static <T extends Comparable<T>> List<SortEvent<Integer>>  mergeSortHelper (Integer[] arr, int front, int back, List<SortEvent<Integer>> SortEvents) {
		if (back-front< 1) return null;
		int mid = (front+back)/2;
		mergeSortHelper(arr, front, mid, SortEvents);
		mergeSortHelper(arr, mid+1, back,SortEvents);
		merge(arr, front, mid, back, SortEvents);
		return SortEvents;
	}
	@SuppressWarnings("unchecked") private static <T extends Comparable<T>> void merge(Integer[] arr, int front, int mid, int back, List<SortEvent<Integer>> SortEvents) {
		SwapEvent SwapEvents = new SwapEvent();
		CompareEvent CompareEvents = new CompareEvent();
		CopyEvent CopyEvents = new CopyEvent();
		
		Object[] tmp = new Object[back-front+1]; 
		int i = front;
		int j = mid+1;
		int k = 0;
		while (i <= mid && j <= back) {
			CompareEvents.storeInts(i, j);
			SortEvents.add(CompareEvents);
			CompareEvents = new CompareEvent();
			if (arr[i].compareTo(arr[j])<=0){
				tmp[k] = arr[i++];
			}
			else{
				tmp[k] = arr[j++];
			}
			k++;
		}
		if (i <= mid && j > back) {
			while (i <= mid) {
				tmp[k++] = arr[i++];
			}
		} else {
			while (j <= back){
				tmp[k++] = arr[j++];
			}
		}
		for (k = 0; k < tmp.length; k++) {
			CopyEvents.storeInt(k + front, tmp[k]);
			SortEvents.add(CopyEvents);
			CopyEvents = new CopyEvent();
			arr[k+front] = (Integer) tmp[k]; 
		}
	}
	public static <T extends Comparable<T>> List<SortEvent<Integer>> quickSort(T[] arr){
		List<SortEvent<Integer>>  SortEvents = new LinkedList<SortEvent<Integer>>();
		return quicksortHelper(arr, 0, arr.length - 1, SortEvents);
	}
	public static <T extends Comparable<T>> List<SortEvent<Integer>> quicksortHelper(T[] arr, int front, int back, List<SortEvent<Integer>>  SortEvents) {
		if (front < back) {
			SwapEvent<Integer> SwapEvents = new SwapEvent();
			CompareEvent<Integer> CompareEvents = new CompareEvent();
			int i = front, j = back;
			int hold = (i + j) / 2;
			T x = arr[hold];
			do {
				CompareEvents.storeInts(i, hold);
				SortEvents.add(CompareEvents);
				CompareEvents = new CompareEvent();
			
				while (arr[i].compareTo(x) < 0) {
					i++;
				}
				while (x.compareTo(arr[j]) < 0){
					j--;
				}
				CompareEvents.storeInts(i, j);
				SortEvents.add(CompareEvents);
				CompareEvents = new CompareEvent();
				if ( i <= j) {
					SwapEvents.storeInts(i, j);
					SortEvents.add(SwapEvents);
					SwapEvents = new SwapEvent();
					swap(arr, i , j);
					i++;
					j--;
				}

			} while (i <= j);
			quicksortHelper(arr, front, j, SortEvents);
			quicksortHelper(arr, i, back, SortEvents);
		}
		return SortEvents;
	}

}

