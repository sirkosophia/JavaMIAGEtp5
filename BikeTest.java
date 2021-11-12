package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeTest {
	
	@Test
	public void setBike() throws Exception{
		Bike l = new Bike("Volvo");
		assertEquals("This is the brand: Volvo This is the value: 100", l.toString());
	}
	
	@Test
	public void getBrand() throws Exception{
		Bike l = new Bike("Volvo");
		assertEquals("Volvo", l.getBrand());
	}
	
	@Test
	public void getValue1() throws Exception{
		Bike l = new Bike("Volvo");
		assertEquals(100, l.getValue());
	}
	
	@Test
	public void printBike() throws Exception {
		Bike l = new Bike("Yoyo");
		assertEquals("This is the brand: Yoyo This is the value: 100", l.toString());
	}
	
	@Test
	public void equals1() throws Exception {
		Bike l = new Bike("Volvo");
		Bike l2 = new Bike("Volvo");
		assertEquals(true, l.equals(l2));
	}
	
	@Test(expected=NullPointerException.class)
	public void equals3() throws Exception {
		Bike l = new Bike("Volvo");
		l.equals(null);
	}

}
