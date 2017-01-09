 import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class CalcMain {
	
	private JFrame frame = null;
	private JPanel pane = null;
	private Rectangle screenBounds = null;
	private Point2D.Float screenRatio = null;
	
	


	
	public CalcMain(){
		//init frame
		frame = new JFrame(CONSTANTS.progName);
		pane = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		screenRatio = new Point2D.Float(screenBounds.width/1920.f,screenBounds.height/1080.f);
		frame.setSize(normX(480), normY(600));
		frame.setLocationRelativeTo(null);
		frame.setContentPane(pane);
		pane.add(new DataEntry(new Point(30,30),new Point(70,20), 3));
		frame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	private int normX(int x){
		return (int)(x*screenRatio.x);
	}
	private int normY(int y){
		return (int)(y*screenRatio.y);
	}
	public static void main(String[] args){
		new CalcMain();
	}
}
