package tp;

public class Car extends Vehicul1{
	private int vetuste;
	private final String name;
	
	public Car (String brand, String name, long value, int vetuste) throws Exception {
		super(brand, value);
		this.vetuste = vetuste;
		this.name = name;
		if (vetuste*1000 <= value) {
			this.value -= vetuste*1000;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public Car(String brand, String name, Discount disc)throws Exception {
		super(brand,disc);
		this.name = name;
	}
	
	public Car (String brand, String name, long value)throws Exception {
		super(brand, value);
		this.name = name;
	}
	
	@Override
	public long getValue() {
		return value;
	}

	@Override
	public String toString() {
		return super.toString() + " This is the value: " + value;
	}

	@Override
	public boolean equals(Vehicul1 c) throws Exception {
		if (c == null) {
			throw new NullPointerException();
		}
		if (c instanceof Car) {
			Car c1 = (Car)c;
			return (super.equals(c) && (this.getValue() == c1.getValue()));
		}
		else {
			throw new ClassCastException();
		}
	}
	
	
	
}
