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
		this.setLocation(myPos);
		this.setSize(Size.x, Size.y);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawRoundRect(0, 0, mySize.x-1, mySize.y-1, myRad, myRad);
	}
}
