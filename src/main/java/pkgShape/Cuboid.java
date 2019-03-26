package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;

	
	public Cuboid(int iWidth, int iLength, int iDepth) {

		super(iWidth, iLength);

		if (iDepth <= 0) {
			throw new IllegalArgumentException("Depth must be positive");
		}

		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	@Override
	public double area() {
		return 2*getiLength()*getiWidth() + 2*getiWidth()*iDepth + 2*getiLength()*iDepth;
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}

	public double volume() {
		return getiLength() * getiWidth() * iDepth;
	}

	public static class SortByVolume implements Comparator<Cuboid>{
		
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.volume(), c2.volume());
		}
	}
	

	public static class SortByArea implements Comparator<Cuboid>{
		
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return Double.compare(c1.area(), c2.area());
		}
	}

}
