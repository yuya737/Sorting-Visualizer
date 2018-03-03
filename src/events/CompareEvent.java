package edu.grinnell.sortingvisualizer.events;

import java.util.LinkedList;
import java.util.List;

public class CompareEvent<T> implements SortEvent<T>{
	List<Integer> compared = new LinkedList<Integer>(); //intialize the compared list as a linkedlist
	public void storeInts(int compared1, int compared2){
		compared.add(compared1); //add the given element to compared
		compared.add(compared2); //add the given element to compared
	}
	public void apply(Object[] arr) { //nothing is executed in apply for CompareEvent
		return;
	}

	public List getAffectedindices() { //return the compared LinkedList
		return compared;
	}

	public boolean isEmphasized() { //CompareEvents are not emphasized
		return false;
	}

	
}
