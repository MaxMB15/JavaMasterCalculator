
public class Decimal implements Number{
	//Attributes
	private double value = 0.d;				//Default value is 0.0
	private int magnitude = 1;
	
	//Constructor
	public Decimal(double val) {
		value = val;
	}
	
	//Methods
	@Override
	public double getValue() {
		return Math.pow(value, (double)magnitude);
		
	}
	
	@Override
	public void print() {
		System.out.println("DEC: " + toString());
	}
	
	@Override
	public String toString() {
		if(this.magnitude != 1)
			return "" + value + '^' + magnitude;
		else
			return "" + value;			
	}

}
