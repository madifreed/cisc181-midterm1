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

	public int compareTo(Object obj) {
		if (obj == null)
			return 0;

		if (getClass() != obj.getClass())
			return 0;

		Cuboid other = (Cuboid) obj;

		if ( this.area() <  other.area()) {
			return -1;
		}
		else if (this.area() > other.area()) {
			return 1;
		}

		return 0;
	}

	public static class SortByVolume implements Comparator<Cuboid>{

		public int compare(Cuboid o1, Cuboid o2) {
			if (o1.volume() < o2.volume()) {
				return -1;
			}
			else if (o1.volume() > o2.volume()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	

	public static class SortByArea implements Comparator<Cuboid>{

		public int compare(Cuboid o1, Cuboid o2) {
			if (o1.area() < o2.area()) {
				return -1;
			}
			else if (o1.area() > o2.area()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}

}
