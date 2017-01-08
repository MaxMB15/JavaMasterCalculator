 import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class CalcMain {
	
	private JFrame frame = null;
	
	
	
	
	//test
	
	//test good
	public CalcMain(){
		//init frame
		frame = new JFrame(CONSTANTS.progName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds());
		frame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		new CalcMain();
	}
}
