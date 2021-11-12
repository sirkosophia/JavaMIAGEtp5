package tp;

public class Bike extends Vehicul1{
	
	public Bike (String brand) {
		super(brand);
		this.value = 100;
	}
	
	public Bike(String brand, Discount disc)throws Exception {
		super(brand,disc);
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
		if (c instanceof Bike) {
			Bike c1 = (Bike)c;
			return (super.equals(c) && (this.getValue() == c1.getValue()));
		}
		else {
			throw new ClassCastException();
		}
	}
}
