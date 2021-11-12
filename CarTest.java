package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test(expected=IllegalArgumentException.class)
	public void setInvalid() throws Exception {
		Car l = new Car("Volvo", "name5", -10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setInvalidVetuste() throws Exception {
		Car l = new Car("Volvo","name4", 1000, 10);
	}
	
	@Test
	public void setCar() throws Exception{
		Car l = new Car("Volvo", "jj", 100000, 5);
		assertEquals("This is the brand: Volvo This is the value: 95000", l.toString());
	}
	
	@Test
	public void getBrand() throws Exception{
		Car l = new Car("Volvo", "mm", 100000, 5);
		assertEquals("Volvo", l.getBrand());
	}
	
	@Test
	public void getValue1() throws Exception{
		Car l = new Car("Volvo", "name", 100000, 5);
		assertEquals(95000, l.getValue());
	}
	
	@Test
	public void getValue2() throws Exception{
		Car l = new Car("Volvo", "name", 100000);
		assertEquals(100000, l.getValue());
	}
	
	@Test
	public void printCar() throws Exception {
		Car l = new Car("Volvo", "kk", 100000, 5);
		assertEquals("This is the brand: Volvo This is the value: 95000", l.toString());
	}

}
