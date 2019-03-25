package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;

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

	public int compareTo(Object obj) {
		if (obj == null)
			return 0;

		if (getClass() != obj.getClass())
			return 0;

		Rectangle other = (Rectangle) obj;

		if ( this.area() <  other.area()) {
			return -1;
		}
		else if (this.area() > other.area()) {
			return 1;
		}

		return 0;
	}

	public static void main (String[] args) {
		Rectangle r = new Rectangle(-1, 1);
		
		System.out.println("Rectange created " + r.getiLength() + " " + r.getiWidth());
		
		
	}
}
