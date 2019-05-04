import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Utils {

	public static void ImageBFS(File file, ArrayList<ArrayList<Integer>> rgbList) throws IOException {
        //BufferedImage bi = ImageIO.read(new File(filePath));
        
        BufferedImage bi = ImageIO.read(file);
        
        int h = bi.getHeight();
        int w = bi.getWidth();

        //System.out.println(h + " " + w);

        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                
                int pixel = bi.getRGB(x, y);
                
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;


                // System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
            }
        }
    }
}

