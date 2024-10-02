package Multi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	
	import javax.imageio.ImageIO;
	import java.awt.Color;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;

	public class FlagColorValidationFromImage {

	    // Define RGB values for the Indian flag colors
	    private static final Color SAFFRON = new Color(255, 153, 51);
	    private static final Color WHITE = new Color(255, 255, 255);
	    private static final Color GREEN = new Color(19, 136, 8);
	    private static final Color BLUE = new Color(0, 0, 128);

	    // Threshold for color comparison
	    private static final int COLOR_THRESHOLD = 50;

	    // Method to compare two colors with a threshold
	    public static boolean isColorMatch(Color actual, Color expected, int threshold) {
	        int diffR = Math.abs(actual.getRed() - expected.getRed());
	        int diffG = Math.abs(actual.getGreen() - expected.getGreen());
	        int diffB = Math.abs(actual.getBlue() - expected.getBlue());
	        
	        return (diffR <= threshold) && (diffG <= threshold) && (diffB <= threshold);
	    }

	    // Method to validate if the image contains the expected flag colors
	    public static void validateFlagColorsInImage(BufferedImage image) {
	        boolean saffronFound = false;
	        boolean whiteFound = false;
	        boolean greenFound = false;
	        boolean blueFound = false;

	        // Loop through image pixels
	        for (int x = 0; x < image.getWidth(); x++) {
	            for (int y = 0; y < image.getHeight(); y++) {
	                // Get pixel color
	                Color pixelColor = new Color(image.getRGB(x, y));

	                // Check for the presence of each flag color
	                if (isColorMatch(pixelColor, SAFFRON, COLOR_THRESHOLD)) {
	                    saffronFound = true;
	                } else if (isColorMatch(pixelColor, WHITE, COLOR_THRESHOLD)) {
	                    whiteFound = true;
	                } else if (isColorMatch(pixelColor, GREEN, COLOR_THRESHOLD)) {
	                    greenFound = true;
	                } else if (isColorMatch(pixelColor, BLUE, COLOR_THRESHOLD)) {
	                    blueFound = true;
	                }

	                // If all colors are found, no need to continue
	                if (saffronFound && whiteFound && greenFound && blueFound) {
	                    break;
	                }
	            }
	        }

	        // Output the results
	        System.out.println("Saffron Found: " + saffronFound);
	        System.out.println("White Found: " + whiteFound);
	        System.out.println("Green Found: " + greenFound);
	        System.out.println("Blue (Ashoka Chakra) Found: " + blueFound);

	        if (saffronFound && whiteFound && greenFound && blueFound) {
	            System.out.println("The image contains all the colors of the Indian flag.");
	        } else {
	            System.out.println("The image does not contain all the colors of the Indian flag.");
	        }
	    }

	    public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("India");
	 String j=  driver.findElement(By.xpath("//img[@id='rimg_1']")).getAttribute("src");
	        String imagePath = "j";

	        try {
	            // Load the image
	            BufferedImage flagImage = ImageIO.read(new File(imagePath));

	            // Validate colors in the image
	            validateFlagColorsInImage(flagImage);
	        } catch (IOException e) {
	            System.out.println("Error reading the image: " + e.getMessage());
	        }
	    }
	
	
	
	
}

