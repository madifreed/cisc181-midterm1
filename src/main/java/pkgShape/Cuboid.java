package pkgShape;

import java.util.Comparator;


/*
 * Cuboid - class extends Rectangle, adds SortByVolume and SortByArea classes
 */
public class Cuboid extends Rectangle {

	
	/*
	 * iDepth - depth of cuboid
	 */
	private int iDepth;


	/*
	 * Cuboid constructor - sets width, length, and depth
	 * and throws IllegalArgumentException if depth is not positive
	 */
	public Cuboid(int iWidth, int iLength, int iDepth) {

		super(iWidth, iLength);

		if (iDepth <= 0) {
			throw new IllegalArgumentException("Depth must be positive");
		}

		this.iDepth = iDepth;
	}

	
	/*
	 * getiDepth - return cuboid depth
	 */
	public int getiDepth() {
		return iDepth;
	}

	
	/*
	 * setiDepth - sets cuboid depth
	 */
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	
	/*
	 * (non-Javadoc)
	 * @see pkgShape.Rectangle#area()
	 * 
	 * area - returns surface area of a cuboid
	 */
	@Override
	public double area() {
		return 2*getiLength()*getiWidth() + 2*getiWidth()*iDepth + 2*getiLength()*iDepth;
	}

	
	/*
	 * (non-Javadoc)
	 * @see pkgShape.Rectangle#perimeter()
	 * 
	 * perimeter - throws UnsupportedOperationException if called
	 */
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}

	
	/*
	 * volume - returns the product of a cuboid's length, width, and depth
	 */
	public double volume() {
		return getiLength() * getiWidth() * iDepth;
	}

	
	/*
	 * SortByVolume - class implements Comparator interface
	 */
	public static class SortByVolume implements Comparator<Cuboid>{
		
		
		/*
		 * (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 * 
		 * compare - compares volumes of two cuboids
		 *     returns 0 if volumes are equal,
		 *     returns a value less than 0 if the first volume is less than the second,
		 *     returns a value greater than 0 if the second volume is greater than the first
		 */
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.volume(), c2.volume());
		}
	}
	

	/*
	 * SortByArea - class implements Comparator interface
	 */
	public static class SortByArea implements Comparator<Cuboid>{
		
		
		/*
		 * (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 * 
		 * compare - compares surface areas of two cuboids
		 *     returns 0 if surface areas are equal,
		 *     returns a value less than 0 if the first surface area is less than the second,
		 *     returns a value greater than 0 if the second surface area is greater than the first
		 */
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.area(), c2.area());
		}
	}

}
