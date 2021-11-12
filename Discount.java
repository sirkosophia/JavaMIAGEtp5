package tp;

public class Discount {
	private static long value;
	
	public Discount(long value) throws Exception{
		if (value >= 0) {
			this.value = value;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public static long getValue() {
		return value;
	}

	public void setValue(long value) throws Exception{
		if (value >= 0) {
			this.value = value;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

}
