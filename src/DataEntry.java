import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class DataEntry extends JComponent{
	private Point myPos,mySize = null;
	private int myRad = 0;
	public DataEntry(Point Position, Point Size, int Radius){
		myPos = Position;
		mySize = Size;
		myRad = Radius;
	}
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRoundRect(myPos.x, myPos.y, mySize.x, mySize.y, myRad, myRad);
	}
}
