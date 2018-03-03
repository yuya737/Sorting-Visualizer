package edu.grinnell.sortingvisualizer.events;

import java.util.LinkedList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {
	List<Integer> copied = new LinkedList<Integer>(); //intialize List copied as a LinkedList
	T copiedThing; // The object to be copied
	public void storeInt(int copiedTo, T copiedThing){
		this.copied.add(copiedTo); //add the copiedTo index to the Copied list
		this.copiedThing = copiedThing; //add the copiedThing to CopyEvent
	}
	public void apply(T[] arr) { //applying copy copies the 'copiedThing' too the copied LinkedList
		arr[copied.get(0)] = this.copiedThing;
	}

	public List<Integer> getAffectedindices() { //return the 'copied' list, the affectindices of this event
		return copied;
	}

	public boolean isEmphasized() { //return true since copy events are emphasized 
		return true;
	}
}
