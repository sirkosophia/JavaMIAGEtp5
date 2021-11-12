package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest2 {

	@Test
	public void equals1() throws Exception {
		Car l = new Car("Volvo", "name", 100000, 5);
		Car l2 = new Car("Volvo", "name", 95000);
		assertEquals(true, l.equals(l2));
	}
	
	@Test
	public void equals2() throws Exception {
		Car l = new Car("Volvo", "jj", 100000, 5);
		Car l2 = new Car("Volvo", "name" ,100000);
		assertEquals(false, l.equals(l2));
	}
	
	@Test(expected=NullPointerException.class)
	public void equals3() throws Exception {
		Car l = new Car("Volvo", "name", 100000, 5);
		l.equals(null);
	}

}
