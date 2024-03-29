package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.sound.sampled.EnumControl.Type;
import javax.swing.JPanel;

import _05_Serialization.MinecraftCreeper;

public class GridPanel extends JPanel implements Serializable {

	private static final String DATA_FILE = "src/_05_Pixel_Art/saved.dat";
	
    private static final long serialVersionUID = 1L;
    private int windowWidth;
    private int windowHeight;
    private int pixelWidth;
    private int pixelHeight;
    private int rows;
    private int cols;

    static // 1. Create a 2D array of pixels. Do not initialize it yet.
    Pixel [] [] pixels;
    private Color color;

    public GridPanel(int w, int h, int r, int c) {
        this.windowWidth = w;
        this.windowHeight = h;
        this.rows = r;
        this.cols = c;

        this.pixelWidth = windowWidth / cols;
        this.pixelHeight = windowHeight / rows;

        color = Color.BLACK;

        setPreferredSize(new Dimension(windowWidth, windowHeight));

        // 2. Initialize the pixel array using the rows and cols variables.
        pixels = new Pixel[rows][cols];

        // 3. Iterate through the array and initialize each element to a new pixel.
        for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				pixels[i][j] = new Pixel(i*pixelWidth, j*pixelHeight);
			}
        }
    }

    public void setColor(Color c) {
        color = c;
    }

    public void clickPixel(int mouseX, int mouseY) {
        // 5. Use the mouseX and mouseY variables to change the color
        //    of the pixel that was clicked. *HINT* Use the pixel's dimensions.
    	pixels[mouseX / pixelWidth][mouseY / pixelHeight].color = color;
    	
    }

    @Override
    public void paintComponent(Graphics g) {
        // 4. Iterate through the array.
        //    For every pixel in the list, fill in a rectangle using the pixel's color.
        //    Then, use drawRect to add a grid pattern to your display.
    	 for (int i = 0; i < pixels.length; i++) {
 			for (int j = 0; j < pixels[i].length; j++) {
 				g.setColor(pixels[i][j].color);
 				g.fillRect(pixels[i][j].x, pixels[i][j].y, pixelWidth, pixelHeight);
 				g.setColor(color.black);				
 				g.drawRect(pixels[i][j].x, pixels[i][j].y, pixelWidth, pixelHeight);
 				
 			}
         }
    }
    public static void save() {
		System.out.println("Sav");
    	try (FileOutputStream fos = new FileOutputStream(new File(DATA_FILE)); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(pixels);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Pixel[] [] load() {
		System.out.println("load");
		try (FileInputStream fis = new FileInputStream(new File(DATA_FILE)); ObjectInputStream ois = new ObjectInputStream(fis)) { 
			return (Pixel [] []) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// This can occur if the object we read from the file is not
			// an instance of any recognized class
			e.printStackTrace();
			return null;
		}
	}

}
