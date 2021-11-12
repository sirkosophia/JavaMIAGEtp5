package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest {
	
	@Test
	public void printGarage() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l1 = new Car("Volvoo", "",100000);
		Car l2 = new Car("Volvooo", "",100000, 4);
		g.add(l);
		g.add(l1);
		g.add(l2);
		assertEquals("This is the brand: Volvo This is the value: 95000, This is the brand: Volvoo This is the value: 100000, This is the brand: Volvooo This is the value: 96000", g.toString());
	}
	
	@Test
	public void getId() {
		Garage g = new Garage();
		Garage g2 = new Garage();
		assertEquals(false, g.getId() == g2.getId());
	}
	
	@Test(expected=NullPointerException.class)
	public void addNullCar() throws Exception {
		Garage g = new Garage();
		Car l2 = new Car("Volvooo", "",100000, 4);
		g.add(l2);
		g.add(null);
	}
	
	@Test
	public void sum() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l1 = new Car("Volvoo", "",100000);
		Car l2 = new Car("Volvooo", "",100000, 4);
		g.add(l);
		g.add(l1);
		g.add(l2);
		assertEquals(291000, g.sumGarage());
	}

	@Test
	public void sum2() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		g.add(l);
		assertEquals(95000, g.sumGarage());
	}
	
	@Test
	public void sum3() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		assertEquals(190000, g.sumGarage());
	}
	
	@Test
	public void firstCar() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		assertEquals(l, g.firstCarByBrand("Volvo"));
	}
	
	@Test
	public void firstCar1() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		assertEquals(null, g.firstCarByBrand("Volv"));
	}

	@Test(expected=NullPointerException.class)
	public void firstCar2() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.firstCarByBrand(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void addNull1() throws Exception {
		Garage g = new Garage();
		Car l = new Car("Volvo", "",100000, 5);
		Car l2 = new Car("Volvo", "",100000, 5);
		g.add(l);
		g.add(l2);
		g.add(null);
	}
	
	

}
