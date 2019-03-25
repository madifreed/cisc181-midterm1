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
	public void invalidRectangleTest() {
		Rectangle r = new Rectangle(-1, 1);
	}

	@Test
	public void getterTests() {
		Rectangle r = new Rectangle(23, 28);
		
		assertEquals(23, r.getiWidth());
		assertEquals(28, r.getiLength());
		
		r.setiLength(44);
		assertEquals(44, r.getiLength());
		
		r.setiWidth(49);
		assertEquals(49, r.getiWidth());
	}
	
	@Test
	public void areaRectangleTest() {
		Rectangle r = new Rectangle(2, 4);
		
		assertEquals(8, r.area(), 0.0001);
	}

	@Test
	public void perimeterRectangleTest() {
		Rectangle r = new Rectangle(2, 4);
		
		assertEquals(12, r.perimeter(), 0.0001);
	}
	

	@Test
	public void compareToRectangleTest() {
		Rectangle r1 = new Rectangle(1, 3);
		Rectangle r2 = new Rectangle(2, 4);
	
		assertEquals(0, r1.compareTo(r1));
		assertEquals(-1, r1.compareTo(r2));
		assertEquals(1, r2.compareTo(r1));
		
		assertEquals(0, r1.compareTo(null));
		assertEquals(0, r1.compareTo("Test"));
	}

}
