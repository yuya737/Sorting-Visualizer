package edu.grinnell.sortingvisualizer.events;

import java.util.List;

public interface SortEvent<T> { //interface for CopeEvent,SwapEvent, and CompareEvent
	void apply (T[] arr); //the required 3 functions for any classes implementing SortEvent
	List<Integer> getAffectedindices();
	boolean isEmphasized();
}
 
