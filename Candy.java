public class Candy {

	private String name;
	private int barCode;
	
	public Candy(String name, int barCode) {
		this.name = name;
		this.barCode = barCode;
	}
	
	public String getName() { return name; }
	public int getBarCode() { return barCode; }
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		// if the object is being compared to itself
		if(o == this) {
			return true;
		}
		
		// if the objects that are being compared are both Candies
		if(!(o instanceof Candy) && !(this instanceof Candy)) {
			return false;
		}
		
		// cast Object o to Candy
		Candy c = (Candy) o;
		// compare the barCode of "this" and "c"
		return this.barCode == c.barCode;		
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " barCode: " + barCode;
	}

}