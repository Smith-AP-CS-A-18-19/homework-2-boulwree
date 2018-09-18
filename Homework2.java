// boulwree
/*
 * Reece Boulware
 */

import java.awt.Rectangle;

public class Homework2 {
	private String c;
	public Homework2(String input) {
    c = input;
	}

	 // Write the constructor for Homework2.
	 //It takes in one parameter: a String
	 //Save the string as a private instance variable

public String uppercase() {
	 c = c.toUpperCase();
	return c;
}
	/* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */

  public String strip(String strip){
		strip = strip.replace(" ","");
		strip = strip.replace(",", "");
		strip = strip.replace(".", "");
		strip = strip.replace("!", "");
		return strip;
	}
	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */


	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle (5, 10, 15, 20);
		double width = new Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2 = new Rectangle();
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle();
		r3.translate( 22, 36);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double rectWidth = rect.getWidth();
		double rectLength = rect.getHeight();
		double rectPeri = 2 * rectWidth + 2 * rectLength;
		return rectPeri;


	}

}
