package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Garage {
	private ArrayList<Vehicul1> lc = new ArrayList<Vehicul1>();  
	private final int id;
	static int count = 0;
	
	public Garage(){
		count ++;
		id = count;
	}
	
	public void add (Vehicul1 v) {
		Objects.requireNonNull(v, "Vehicul must be not null");
		lc.add(v);
		
		ArrayList<Vehicul1> gar = lc;

		Comparator<Vehicul1> compareByValue = 
				(Vehicul1 o1, Vehicul1 o2) -> Long.compare(o1.getValue(), o2.getValue());
		Collections.sort(gar, compareByValue);
		
		/*Comparator<Vehicul1> compareByBrand = 
			(Vehicul1 o1, Vehicul1 o2) -> o1.getBrand().compareTo( o2.getBrand() );
		Collections.sort(gar, compareByBrand);
		*/
	}
	
	public ArrayList<Vehicul1> getLc() {
		return lc;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lc.size()- 1; i++) {
			sb.append(lc.get(i).toString() + ", ");
		}
		sb.append(lc.get(lc.size() - 1).toString());
		return sb.toString();
	}
	
	public long sumGarage() {
		long res = 0;
		for (int i = 0; i<lc.size(); i++) {
			res += lc.get(i).getValue();
		} 
		return res;
	}
	
	public Vehicul1 firstCarByBrand(String brand) throws Exception{
		if (brand == null) {
			throw new NullPointerException();
		}
		else {
			for (int i = 0; i<lc.size(); i++) {
				if (lc.get(i).getBrand() == brand) {
					return lc.get(i);
				}
			}
			return null;
		}
	}
	
	public int indexOf(Vehicul1 c) throws Exception {
		if (c == null) {
			throw new NullPointerException();
		}
		else {
			for (int i = 0; i<lc.size(); i++) {
				if (lc.get(i).equals(c)) {
					return i;
				}
			}
			return -1;
		}
	}
	
	public void remove(Vehicul1 c) throws Exception {
		if (c == null) {
			throw new NullPointerException();
		}
		else {
			for (int i = 0; i<lc.size(); i++) {
				if (lc.get(i).equals(c)) {
					lc.remove(i);
				}
			}
		}
	}
	
	public void protectionism (String brand) throws Exception{
		ArrayList<Vehicul1> lc1 = new ArrayList<Vehicul1>();
		if (brand == null) {
			throw new NullPointerException();
		}
		else {
			for (int i = 0; i<lc.size(); i++) {
				if (lc.get(i).getBrand() != brand) {
					lc1.add(lc.get(i));
				}
			}
		}
		lc = lc1;
	}
	
	
	
	@Override
	public boolean equals(Object g){
		if (g == null) {
			throw new NullPointerException();
		}
		if (g instanceof Garage) {
			Garage g1 = (Garage)g;
			ArrayList<Vehicul1> gar = lc;
			ArrayList<Vehicul1> gar2 = g1.lc;
			Comparator<Vehicul1> compareByName = Comparator
	                .comparing(Vehicul1::getBrand)
	                .thenComparing(Vehicul1::getValue);
			Collections.sort(gar, compareByName);
			Collections.sort(gar2, compareByName);

		
			/*
			Comparator<Vehicul1> compareByValue = 
					(Vehicul1 o1, Vehicul1 o2) -> Long.compare(o1.getValue(), o2.getValue());
			Collections.sort(gar, compareByValue);
			Collections.sort(gar2, compareByValue);
			*/
			/*
			Comparator<Vehicul1> compareByBrand = 
				(Vehicul1 o1, Vehicul1 o2) -> o1.getBrand().compareTo( o2.getBrand() );
			Collections.sort(gar, compareByBrand);
			Collections.sort(gar2, compareByBrand);
			*/
			Boolean res = g1.getLc().size() == lc.size();
			for (int i = 0; i<lc.size(); i++) {
				try {
					res = lc.get(i).equals(g1.getLc().get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return res;
		}
		else {
			throw new ClassCastException();
		}
		
	}

}
