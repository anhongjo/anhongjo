import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Car{
	int x = 0;
	int y = 0;
	BufferedImage image;
	
	public Car(int x, int y, String imagePath){
		this.x = x;
		this.y = y;
		
		try {
			this.image = ImageIO.read(new File(imagePath));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		

}
