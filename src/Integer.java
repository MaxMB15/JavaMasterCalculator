
public class Integer implements Number{
	//Attributes
	private int value = 0;				//Default value is 0
	private int magnitude = 1;
	
	//Constructor
	public Integer(int val) {
		value = val;
	}
	
	//Methods
	@Override
	public double getValue() {
		return Math.pow(value, magnitude);	
	}
	
	@Override
	public void print() {
		System.out.println("INT: " + toString());
	}
	
	@Override
	public String toString() {
		if(this.magnitude != 1)
			return "" + value + '^' + magnitude;
		else
			return "" + value;			
	}

}
