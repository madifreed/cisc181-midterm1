package pkgShape;

/*
 * Rectangle - class that extends Shape, implements Comparable interface, 
 * and adds compareTo() method
 */
public class Rectangle extends Shape implements Comparable<Object> {

	
	/*
	 * iWidth - the width of the rectangle
	 */
	private int iWidth;
	
	
	/*
	 * iLength - the length of the rectangle
	 */
	private int iLength;

	
	/*
	 * Rectangle constructor - sets width and length and throws IllegalArgumentException
	 * if width and length are not positive
	 */
	public Rectangle(int iWidth, int iLength) {
		if ((iWidth <= 0) || (iLength <= 0)) {
			throw new IllegalArgumentException("Width and Length must be positive");
		}
		
		this.iWidth = iWidth;
		this.iLength = iLength;
	}


	/*
	 * getiWidth - returns rectangle width
	 */
	public int getiWidth() {
		return iWidth;
	}

	
	/*
	 * setiWidth - sets rectangle width
	 */
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	
	/*
	 * getiLength - returns rectangle length
	 */
	public int getiLength() {
		return iLength;
	}

	
	/*
	 * setiLength - sets rectangle length
	 */
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	
	/*
	 * (non-Javadoc)
	 * @see pkgShape.Shape#area()
	 * 
	 * area - returns the product of width and length
	 */
	@Override
	public double area() {
		return iWidth*iLength;
	}

	
	/*
	 * (non-Javadoc)
	 * @see pkgShape.Shape#perimeter()
	 * 
	 * perimeter - returns the width doubled plus the length doubled
	 */
	@Override
	public double perimeter() {
		return iWidth*2 + iLength*2;
	}

	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * compareTo - if the argument is not a valid Shape, throws IllegalArgumentException
	 * else compares the areas of two Shapes and
	 *     returns 0 if areas are equal,
	 *     returns a value less than 0 if the first area is less than the second,
	 *     returns a value greater than 0 if the second area is greater than the first
	 */
	@Override
	public int compareTo(Object obj) {
		
		if (!(obj instanceof Shape)) {
			throw new IllegalArgumentException("Invalid object");
		}
		
		Shape other = (Shape) obj;

		return Double.compare(this.area(), other.area());
	}

}