package pkgShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;


public class CuboidTest {

	@Test
	public void validCuboidTest() {
		Cuboid c = new Cuboid(2, 4, 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidCuboid1Test() {
		Cuboid c = new Cuboid(1, 1, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidCuboid2Test() {
		Cuboid c = new Cuboid(1, 1, 0);
	}

	@Test
	public void getterTests() {
		Cuboid c = new Cuboid(3, 4, 5);
		
		assertEquals(3, c.getiWidth());
		assertEquals(4, c.getiLength());
		assertEquals(5, c.getiDepth());
	}
	
	@Test
	public void setterTests() {
		Cuboid c = new Cuboid(3, 4, 5);
		
		c.setiLength(10);
		assertEquals(10, c.getiLength());
		
		c.setiWidth(20);
		assertEquals(20, c.getiWidth());
		
		c.setiDepth(30);
		assertEquals(30, c.getiDepth());
	}
	
	
	@Test
	public void areaCuboidTest() {
		Cuboid c = new Cuboid(2, 4, 3);
		
		assertEquals(0, Double.compare(52.0, c.area()));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void perimeterCuboidTest() {
		Cuboid c = new Cuboid(2, 4, 2);
		
		double p = c.perimeter();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void compareToStringTest() {
		Cuboid c = new Cuboid(1, 3, 2);
		
		c.compareTo("Test");
	}

	@Test (expected = IllegalArgumentException.class)
	public void compareToNullTest() {
		Cuboid c = new Cuboid(1, 3, 2);
		
		c.compareTo(null);
	}

	@Test
	public void compareToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 4);
	
		assertEquals(0, c1.compareTo(c1));
		assertEquals(-1, c1.compareTo(c2));
		assertEquals(1, c2.compareTo(c1));
	}

	@Test
	public void areaComparatorToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 5);
		Cuboid c3 = new Cuboid(2, 4, 1);
		
		List<Cuboid> cuboids = Arrays.asList(c1, c2, c2, c3);
	
		Collections.sort(cuboids, new SortByArea());
		
		for (int i = 0; i < (cuboids.size()-1); i++) {
			assertTrue(cuboids.get(i).compareTo(cuboids.get(i+1)) <= 0);
		}
	}


	@Test
	public void volumeComparatorToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 5);
		Cuboid c3 = new Cuboid(2, 4, 1);
		
		List<Cuboid> cuboids = Arrays.asList(c1, c2, c2, c3);
	
		Collections.sort(cuboids, new SortByVolume());
		
		for (int i = 0; i < (cuboids.size()-1); i++) {
			assertTrue(cuboids.get(i).volume() <= cuboids.get(i+1).volume());
		}
	}

}
