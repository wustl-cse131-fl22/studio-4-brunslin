package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0,12);
		StdDraw.setYscale(0,12);
		
		StdDraw.setPenColor(Color.cyan);
		
		StdDraw.filledRectangle(3, 6, 3, 3);
		
		StdDraw.setPenColor(Color.yellow);
		
		StdDraw.filledRectangle(9, 6, 3, 3);
		
	}
}