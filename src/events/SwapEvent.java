package edu.grinnell.sortingvisualizer.events;

import java.util.LinkedList;
import java.util.List;

public class SwapEvent<T> implements SortEvent<T> {
	List<Integer> swapped = new LinkedList<Integer>();
	public void storeInts(int swapped1, int swapped2){
		swapped.add(swapped1);
		swapped.add(swapped2);
	}
	public void apply(T[] arr) {
		T temp = arr[swapped.get(0)]; 
		arr[swapped.get(0)] = arr[swapped.get(1)]; 
		arr[swapped.get(1)] = temp; 
	}

	public List<Integer> getAffectedindices() {
		return swapped;
	}

	public boolean isEmphasized() {
		return true;
	}

}
