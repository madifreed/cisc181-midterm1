package pkgShape;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;


public class RectangleTest {

	@Test
	public void validRectangleTest() {
		Rectangle r = new Rectangle(2, 4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidRectangle1Test() {
		Rectangle r = new Rectangle(-1, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidRectangle2Test() {
		Rectangle r = new Rectangle(1, 0);
	}

	@Test (expected = IllegalArgumentException.class)
	public void invalidRectangle3Test() {
		Rectangle r = new Rectangle(1, -1);
	}
	
	@Test
	public void getterTests() {
		Rectangle r = new Rectangle(23, 28);
		
		assertEquals(23, r.getiWidth());
		assertEquals(28, r.getiLength());
	}
	
	@Test
	public void setterTests() {
		Rectangle r = new Rectangle(23, 28);
		
		r.setiLength(44);
		assertEquals(44, r.getiLength());
		
		r.setiWidth(49);
		assertEquals(49, r.getiWidth());
	}
	
	@Test
	public void areaRectangleTest() {
		Rectangle r = new Rectangle(2, 4);
		
		assertEquals(0, Double.compare(8.0, r.area()));
	}

	@Test
	public void perimeterRectangleTest() {
		Rectangle r = new Rectangle(2, 4);
		
		assertEquals(0, Double.compare(12.0, r.perimeter()));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void compareToStringTest() {
		Rectangle r = new Rectangle(1, 3);
		
		r.compareTo("Test");
	}

	@Test (expected = IllegalArgumentException.class)
	public void compareToNullTest() {
		Rectangle r = new Rectangle(1, 3);
		
		r.compareTo(null);
	}
	
	@Test
	public void compareToRectangleTest() {
		Rectangle r1 = new Rectangle(1, 3);
		Rectangle r2 = new Rectangle(2, 4);
	
		assertEquals(0, r1.compareTo(r1));
		assertEquals(-1, r1.compareTo(r2));
		assertEquals(1, r2.compareTo(r1));
	}

}
