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

	
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int i) {
		iWidth = i;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int i) {
		iLength = i;
	}

	@Override
	public double area() {
		return iWidth*iLength;
	}

	@Override
	public double perimeter() {
		return iWidth*2 + iLength*2;
	}

	@Override
	public int compareTo(Object obj) {
		
		if (!(obj instanceof Shape)) {
			throw new IllegalArgumentException("Invalid object");
		}
		
		Shape other = (Shape) obj;

		return Double.compare(this.area(), other.area());
	}

}
