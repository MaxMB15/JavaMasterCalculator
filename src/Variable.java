
public class Variable {
	//Attributes
	public Character variableCharacter = null;
	public int magnitude = 1;
	
	//Constructor
	private Variable() {};
	public Variable(char c) {
		if(Character.isAlphabetic(c)) {
			variableCharacter = c;
		}
		else {
			//If not a valid char, throw an exception
			try {
				throw new Exception("Not a valid variable character");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
	
	//Methods
	public boolean equals(Variable var) {			//Checks if variable is equal to the one given
		if(variableCharacter.equals(var.variableCharacter) && magnitude == var.magnitude) {
			return true;
		}
		return false;
	}
}
