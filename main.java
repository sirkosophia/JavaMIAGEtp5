package tp;

import java.util.ArrayList;
import java.util.HashSet;

public class main {

	public static void main(String[] args) throws Exception {
		Car a = new Car("Audi", "name7", 10000);
		Car b = new Car("BMW","name345", 9000); 
		Car c = new Car("BMW","0976name", 9000); 
		Car d = a;
		
		System.out.println(a==b); 
		System.out.println(b==c); 
		System.out.println(a==d); 
		System.out.println(a.equals(b)); 
		System.out.println(b.equals(c)); 
		System.out.println(a.equals(d));
		
		ArrayList<Car> list = new ArrayList<>(); 
		Garage garage = new Garage();
		garage.add(a);
		garage.add(b);
		list.add(a);
		list.add(b);
		System.out.println(garage.indexOf(a)); 
		System.out.println(garage.indexOf(b)); 
		System.out.println(garage.indexOf(c)); 
		System.out.println(b.equals(c));
	
		HashSet<Car> set = new HashSet<Car>(); 
		set.add(b); 
		System.out.println(set.contains(c));
		
		Garage g = new Garage();
		Garage g1 = new Garage();
		Vehicul1 l = new Bike("Volvo");
		Vehicul1 l1 = new Bike("Bike");
		Car l2 = new Car("Volvo","name4", 100000, 5);
		g.add(l);
		g.add(l2);
		g.add(l1);
		g1.add(l1);
		System.out.println(g);
	
		g.protectionism("Volvo");
		System.out.println(g);
		Vehicul1 c1 = new Bike("A");
		Vehicul1 c2 = new Bike("B");
		Vehicul1 c3 = new Bike("C");
		Garage gg = new Garage();
		gg.add(c3);
		gg.add(c1);
		gg.add(c2);
		System.out.println(gg);
	}
}
	
