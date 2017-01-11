import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class DataEntry extends JComponent{
	private Point myPos,mySize = null;
	public DataEntry(Point Position, Point Size){
		myPos = Position;
		mySize = Size;
		this.setLocation(myPos);
		this.setSize(Size.x, Size.y);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(new Color(143, 202, 232));
		
		g.fillRect(0, 0, mySize.x, mySize.y);
	}
}
