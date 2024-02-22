package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {

	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(255,255,0);
		StdDraw.filledCircle(0.5, 0.5, 0.45);
		StdDraw.setPenColor(0,0,0);
		StdDraw.circle(0.5, 0.5, 0.45);
		StdDraw.filledEllipse(0.35, 0.65, 0.1, 0.05);
		StdDraw.filledCircle(0.65, 0.65, 0.1);
		StdDraw.filledCircle(.5, 0.3, 0.1);
	
	}
}
