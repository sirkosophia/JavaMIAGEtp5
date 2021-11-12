package tp;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest4 {

	@Test
	public void compare() throws Exception {
		Garage g = new Garage();
		Garage g1 = new Garage();
		Vehicul1 l = new Bike("Volvo");
		Vehicul1 l1 = new Bike("Bike");
		Car l2 = new Car("Volvo", "name1", 100000, 5);
		Bike l3 = new Bike("Vovo");
		g.add(l);
		g.add(l2);
		g.add(l1);
		g1.add(l1);
		g.protectionism("Volvo");
		g.add(l3);
		g1.add(l3);
		assertEquals(true, g.equals(g1));
	}
	
	@Test
	public void garageEquality() throws Exception {
		 Garage garage1 = new Garage();
		 Garage garage2 = new Garage();

		 Car car1 = new Car("BMW", "42abc75" , 90000);
		 Car car2 = new Car("Lada", "42abc76", 6500, 2);
		 Car car3 = new Car("Lada", "42abc76", 5500, 1);
		 Bike bike1 = new Bike("Scott");
		 Bike bike2 = new Bike("Merlin",new Discount(50));
		 Bike bike3 = new Bike("Merlin");
		 
		 garage1.add(car1);
		 garage1.add(bike1);
		 garage1.add(car2);
		 garage1.add(bike2);
		 garage1.add(car3);        
		 garage1.add(bike3);
		 
		 garage2.add(bike1);
		 garage2.add(car1);    
		 garage2.add(car3); 
		 garage2.add(car2);
		 garage2.add(bike3);
		 garage2.add(bike2);       
		 
		 assertEquals(garage1, garage2);
	}
}
