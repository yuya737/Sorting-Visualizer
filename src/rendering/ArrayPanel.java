package edu.grinnell.sortingvisualizer.rendering;
import edu.grinnell.sortingvisualizer.audio.NoteIndices;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    private int width;
    private int height;
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) { //paint the panel
    	g.clearRect(0, 0, width, height); //first clear anything on the panel before paintng
    	for(int i = 0; i < this.notes.getNotes().length; i++){ //walk across the array to paint
    		g.setColor(Color.BLUE); //set paint to blue
    		if(this.notes.isHighlighted(i)){ //if the give note is highlighted, then set the color to yellow
    			g.setColor(Color.YELLOW); //set paint to blue
    		}
    		g.fillRect(i * this.width/this.notes.getNotes().length, height - (this.height/this.notes.getNotes().length) * this.notes.getNotes()[i] ,this.width/this.notes.getNotes().length, (this.height/this.notes.getNotes().length) * this.notes.getNotes()[i]); //fill the respective rectangles with appropriate width and height according to the number at the index	
    	}
    }
}
