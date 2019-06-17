import java.util.ArrayList;

/**
 * A Term is a collection of variables and a scaler
 * 
 * @author maxboksem
 *
 */
public class Term {
	//Attributes
	public Number scaler = null;
	public ArrayList<Variable> variables = new ArrayList<Variable>();
	
	//Constructor
	private Term() {};
	public Term(Number scaler, ArrayList<Variable> variables) {
		this.scaler = scaler;
		this.variables = variables; //MIGHT HAVE TO MAKE A DEEP COPY
	}
	
	//Methods
	public boolean equals(Term t) {			//Checks if variable is equal to the one given
		if(scaler == t.scaler && isTermVarsEqual(t)) {
			return true;
		}
		return false;
	}
	public boolean isTermVarsEqual(Term t) {
		//Make a copy of the current variables
		ArrayList<Variable> copy = new ArrayList<Variable>(variables);
		//Remove them if found
		for(Variable var : t.variables) {
			if(!copy.remove(var)) {		//Make sure the variable is present and can be remove
				return false;
			}
		}
		//Make sure List is empty
		if(copy.size() == 0) {
			return true;
		}
		return false;		//If there still remains variable in copy
		
	}
	/**
	 * Convert to expression
	 * 
	 * @return an expression version of the term
	 */
	public ExpressionTree toExpressionTree() {
		return new ExpressionTree(this);
	}
	/**
	 * 
	 * @return makes a deep copy of Term
	 */
	public Term deepCopy() {
		return new Term(Number.makeNumber(scaler.getValue()), new ArrayList<Variable>(variables));
	}
	/**
	 * @return returns string representation of the Term
	 */
	public String toString() {
		//initialize a string to store all the toStrings from the variables
		String retStr = scaler.toString();
		//Go through the variables
		for(Variable var : variables)
			retStr += var.toString();
		return retStr;
	}
}
