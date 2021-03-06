package old;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.Point2D;

import javax.swing.*;

public class CalcMain {
	
	private JFrame frame = null;
	private JPanel pane = null;
	private Rectangle screenBounds = null;
	private Point2D.Float screenRatio = null;
	
	
	
	public CalcMain(){
		//init frame
		frame = new JFrame(CONSTANTS.progName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		screenRatio = new Point2D.Float(screenBounds.width/1920.f,screenBounds.height/1080.f);
		frame.setSize(normX(480), normY(600));
		frame.setLocationRelativeTo(null);

		int paddingX = normX(40);
		DataEntry dE1 = new DataEntry(new Point(paddingX,30),new Point(frame.getWidth()-paddingX*2,60));
		
		pane = new JPanel();
		
		pane.setLayout(null);
		pane.add(dE1);
		frame.setContentPane(pane);
		frame.addComponentListener(new ComponentListener() {
		    
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
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
