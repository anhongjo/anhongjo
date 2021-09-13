import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Screen extends Canvas implements KeyListener {

	Car car[] = new Car[2];
	private static final long serialVersionUID = 1L;
	
	public Screen() {
		car[0] = new Car(0, 0, "src/car.png");
		car[1] = new Car(0, 50, "src/car.png");
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(car[0].image, car[0].x, car[0].y, this);
		g.drawImage(car[1].image, car[1].x, car[1].y, this);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int gap = 10;
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:
			car[0].y -= gap;
			car[1].y -= gap;
			break;
		case KeyEvent.VK_DOWN:
			car[0].y += gap;
			car[1].y += gap;
			break;
		case KeyEvent.VK_LEFT:
			car[0].x -= gap;
			car[1].x -= gap;
			break;
		case KeyEvent.VK_RIGHT:
			car[0].x += gap;
			car[1].x += gap;
			break;
		}
		System.out.println(car[0].x+", "+car[0].y+"/"+car[1].x+", "+car[1].y);
		

		repaint();
	}

}
