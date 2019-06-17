
public interface Number {
	
	//Methods
	public double getValue();
	public void print();
	
	/**
	 * This method is useful as it returns and Integer or Decimal number corresponding with the value
	 * 
	 * @param value the value of the number to create
	 * @return Integer or Decimal number of value
	 */
	public static Number makeNumber(double value) {
		if((double)((int)value) == value){		//Check if can be converted to an Integer
			return new Integer((int)value);
		}
		else {									//Must be a decimal number
			return new Decimal(value);
		}
	}
	
	
}
