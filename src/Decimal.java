
public class Decimal implements Number{
	//Attributes
	private double value = 0.d;				//Default value is 0.0
	
	//Constructor
	public Decimal(double val) {
		value = val;
	}
	
	//Methods
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
