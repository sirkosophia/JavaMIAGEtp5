package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest3 {

	@Test(expected=NullPointerException.class)
	public void protectionism1() throws Exception {
		Garage g = new Garage();
		Vehicul1 l = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.protectionism(null);
	}
	
	@Test
	public void protectionism2() throws Exception {
		Garage g = new Garage();
		Garage g1 = new Garage();
		Vehicul1 l = new Bike("Volvo");
		Vehicul1 l1 = new Bike("Bike");
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.add(l1);
		g1.add(l1);
		g.protectionism("Volvo");
		assertEquals(g1.toString(), g.toString());
	}
	
	@Test
	public void protectionism3() throws Exception {
		Garage g = new Garage();
		Garage g1 = new Garage();
		Vehicul1 l = new Bike("Volv");
		Vehicul1 l1 = new Bike("Bike");
		Car l2 = new Car("Volv", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.add(l1);
		g1.add(l);
		g1.add(l2);
		g.protectionism("Bike");
		assertEquals(g1.toString(), g.toString());
	}

}
