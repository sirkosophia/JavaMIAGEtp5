package tp;

public class Vehicul1 implements Comparable<Vehicul1>{
	private final String brand;
	private Integer discount = null;
	protected long value;
	
	
	public Vehicul1 (String brand) {
		this.brand = brand;
	}
	
	public Vehicul1 (String brand, Discount disc)throws Exception {
		this.brand = brand;
		if (disc.getValue() >= 0) {
			this.value = disc.getValue();
		}
		else {
			throw new IllegalArgumentException();
		}
	}
			
	public Vehicul1 (String brand, long value)throws Exception {
		this.brand = brand;
		if (value >= 0) {
			this.value = value;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public void setDiscount() {
		this.discount = 0;
		this.value = Discount.getValue();
	}

	public String getBrand() {
		return brand;
	}
	
	@Override
	public String toString() {
		return "This is the brand: " + brand;
	}
	
	public boolean equals(Vehicul1 c) throws Exception{
		if (c == null) {
			throw new NullPointerException();
		}
		else {
			return (this.getBrand() == c.getBrand());
		}
	}
	
	public long getValue() {
		return value;
	}

	@Override
	public int compareTo(Vehicul1 o) {
		return brand.compareTo(o.getBrand());
	}

}
