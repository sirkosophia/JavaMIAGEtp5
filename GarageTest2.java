package tp;


import static org.junit.Assert.*;

import org.junit.Test;


public class GarageTest2 {

	@Test(expected=NullPointerException.class)
	public void indexOf() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.indexOf(null);
	}
	
	@Test
	public void indexOf2() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",50000, 5);
		g.add(l);
		g.add(l2);
		assertEquals(1, g.indexOf(l2));
	}
	
	@Test
	public void indexOf3() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l2);
		assertEquals(0, g.indexOf(l));
	}
	
	@Test(expected=NullPointerException.class)
	public void remove() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.remove(null);
	}
	
	@Test
	public void remove2() throws Exception {
		Garage g = new Garage();
		Garage g2 = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l2);
		g2.add(l);
		g2.add(l2);
		g2.remove(l);
		assertEquals(g.toString(), g2.toString() );
	}
}
