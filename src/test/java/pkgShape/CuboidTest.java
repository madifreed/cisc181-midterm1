package pkgShape;

import static org.junit.Assert.assertEquals;

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
		Cuboid c = new Cuboid(-1, 1, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidCuboid2Test() {
		Cuboid c = new Cuboid(1, 1, 0);
	}

	@Test
	public void areaCuboidTest() {
		Cuboid c = new Cuboid(2, 4, 3);
		
		assertEquals(52, c.area(), 0.0001);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void perimeterCuboidTest() {
		Cuboid c = new Cuboid(2, 4, 2);
		
		double p = c.perimeter();
	}
	

	@Test
	public void compareToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 4);
	
		assertEquals(0, c1.compareTo(c1));
		assertEquals(-1, c1.compareTo(c2));
		assertEquals(1, c2.compareTo(c1));
		
		assertEquals(0, c1.compareTo(null));
		assertEquals(0, c1.compareTo("Test"));
	}

	@Test
	public void areaComparatorToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 5);
		Cuboid c3 = new Cuboid(2, 4, 1);
		
		List<Cuboid> cuboids = Arrays.asList(c1, c2, c3);
	
		Collections.sort(cuboids, new SortByArea());
		
		assertEquals(-1, cuboids.get(0).compareTo(cuboids.get(1)));
		assertEquals(-1, cuboids.get(1).compareTo(cuboids.get(2)));
	}


	@Test
	public void volumeComparatorToCuboidTest() {
		Cuboid c1 = new Cuboid(1, 3, 2);
		Cuboid c2 = new Cuboid(2, 4, 5);
		Cuboid c3 = new Cuboid(2, 4, 1);
		
		List<Cuboid> cuboids = Arrays.asList(c1, c2, c3);
	
		Collections.sort(cuboids, new SortByVolume());
		
		assertEquals(-1, cuboids.get(0).compareTo(cuboids.get(1)));
		assertEquals(-1, cuboids.get(1).compareTo(cuboids.get(2)));
	}

}
