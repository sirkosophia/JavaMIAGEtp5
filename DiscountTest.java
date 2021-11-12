package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest {

	@Test
	public void setDiscount() throws Exception{
		Discount d = new Discount(50);
		assertEquals(50, d.getValue());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setDiscountException() throws Exception {
		Discount d = new Discount(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setValueException() throws Exception{
		Discount d = new Discount(50);
		d.setValue(-200);
	}
	
	@Test
	public void setValue() throws Exception{
		Discount d = new Discount(50);
		d.setValue(200);
		assertEquals(200, d.getValue());
	}
	
	@Test
	public void setDiscountBike() throws Exception{
		Discount d = new Discount(50);
		Bike l = new Bike("Volvo");
		l.setDiscount();
		assertEquals(50, l.getValue());
	}
	
	@Test
	public void setDiscountCar() throws Exception{
		Discount d = new Discount(50);
		Car l = new Car("Volvo","name", 100000, 5);
		l.setDiscount();
		assertEquals(50, l.getValue());
	}

}
