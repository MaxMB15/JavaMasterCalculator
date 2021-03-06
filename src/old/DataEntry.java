package old;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class DataEntry extends JComponent{
	private Point myPos,mySize = null;
	private BufferedImage xImage = null;
	private Color keyColor = new Color(143, 202, 232);
	
	public DataEntry(Point Position, Point Size){
		myPos = Position;
		mySize = Size;
		this.setLocation(myPos);
		this.setSize(Size.x, Size.y);
		try {
			xImage = CONSTANTS.changeColor(new Color(keyColor.getRed()+20,keyColor.getGreen()+20,keyColor.getBlue()+20), ImageIO.read(new File("src/Resources/X.png")));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(keyColor);
		g.fillRect(0, 0, mySize.x, mySize.y);
		g.setColor(Color.white);
		g.fillRect(mySize.x/4, 2, (3*(mySize.x/4))-2, mySize.y-4);
		g.setColor(new Color(keyColor.getRed()+20, keyColor.getGreen()+20, keyColor.getBlue()+20));
		g.drawRect(0, 0, mySize.x, mySize.y);
		g.drawImage(xImage,mySize.x/16, mySize.y/4, mySize.x/8, mySize.y/2, null);
		
	}
}
