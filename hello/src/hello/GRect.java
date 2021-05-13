package hello;

import java.awt.*;

public class GRect extends Shape {
	public GRect(int x, int y) {
		super(x, y);
	}
	public void paint(Graphics g) {
		g.drawRect(x,  y, 180, 100);
	}

}
