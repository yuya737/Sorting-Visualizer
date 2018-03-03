package edu.grinnell.sortingvisualizer.audio;
import java.util.Random;
/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {

    /**
     * @param n the size of the scale object that these indices map into
     */
	public Integer[] notes;   //stores the notes to be sorted and the notes after sorting
	public Integer[] unsortedNotes; //stores the initial unsorted notes
	public boolean[] highlights; //bolean array of whether or not the indices are highlighted 
    public NoteIndices(int n) { //constructor for noteindices
    	this.notes = new Integer[n];
    	this.unsortedNotes = new Integer[n];
    	this.highlights = new boolean[n]; //all arrays are of length n
    	for(int i = 0; i < this.highlights.length; i++){ //initialize highlights with all false
        	this.highlights[i] = false; 
        }
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) { //return an array of length n, with numbers from 0 to n-1 in random order
        Random rand = new Random(); //intialize random
        this.notes = new Integer[n]; //constructor for noteindices
        this.unsortedNotes = new Integer[n];
        this.highlights = new boolean[n];
        for(int i = 0; i < this.highlights.length; i++){
        	this.highlights[i] = false;
        }
        for(int i = 0; i  < this.notes.length; i++){ //first fill the array with numbers from 0 to n-1
        	this.notes[i] = i;
        }
        for(int i = 0; i < this.notes.length; i++){ //shuffle the array to produce an array of random order
        	int index = rand.nextInt(this.notes.length);
        	int temp = this.notes[index]; //switch values using temp
        	this.notes[index] = this.notes[i];
        	this.notes[i] = temp;
        }
        for(int i = 0; i < this.notes.length; i++){ //copy the unsorted array to store information
        	this.unsortedNotes[i] = this.notes[i]; //walk across the array the copy elements
        }
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { //return the note 
        // TODO: fill me in
        return this.notes;
    }
    public Integer[] getUnsortedNotes() { //return the unsorted notes
        // TODO: fill me in
        return this.unsortedNotes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) { //higlights the given index by changing the boolean to true
        this.highlights[index] = true;
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) { //return whether or not the given index is highlighted
        // TODO: fill me in
        return this.highlights[index];
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() { //set all the boolean in highlights to false, 'clearing' all highlighted
        for(int i = 0; i < this.highlights.length; i++){
        	this.highlights[i] = false; //set indices to false. 
        }
    }
}
