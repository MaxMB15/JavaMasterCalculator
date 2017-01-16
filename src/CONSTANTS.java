import java.awt.Color;
import java.awt.image.BufferedImage;

public class CONSTANTS {
	static final String progName = "Cheeky Calculator";
	static final double pi = Math.PI;
	static final double e = Math.E;
	
	static BufferedImage changeColor(Color c, BufferedImage bi){
		Color cTemp = null;
		for(int x = 0; x<bi.getWidth();x++){
			for(int y = 0;y<bi.getHeight();y++){
				cTemp = new Color(bi.getRGB(x, y));
				cTemp = new Color((int)(cTemp.getRed()*(c.getRed()/255f)),
						(int)(cTemp.getGreen()*(c.getGreen()/255f)),
						(int)(cTemp.getBlue()*(c.getBlue()/255f)),
						cTemp.getAlpha());
				bi.setRGB(x, y, cTemp.getRGB());
			}
		}
		return bi;
	}
}
