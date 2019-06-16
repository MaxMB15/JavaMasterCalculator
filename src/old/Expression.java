package old;
import java.util.ArrayList;

/**
 * Operations in between Terms represented as a tree
 * 
 * @author maxboksem
 *
 */
public class Expression {
	//Attributes
	public ArrayList<Term> terms = null;
	public ArrayList<Character> operators = null;
	
	//Constructor
	public Expression(ArrayList<Term> terms, ArrayList<Character> operators) {
		//initialize sets
		terms = new ArrayList<Term>();
		operators = new ArrayList<Character>();
		this.terms = terms;
		this.operators = operators;
	}
	private Expression() {
		terms = new ArrayList<Term>();
		operators = new ArrayList<Character>();
	}
	
	//Methods
	/**
	 * Creates a deep copy of an expression
	 * 
	 * @return Expression - Deep copy of object
	 */
	public Expression makeDeepCopy() {
		//Create a new Expression to add to
		Expression newCopy = new Expression();
		//Add terms and operators
		for(int i = 0; i<terms.size()-1; i++) {
			newCopy.terms.add(terms.get(i));
			newCopy.operators.add(operators.get(i));
		}
		newCopy.terms.add(terms.get(terms.size()-1));
		//return new copy
		return newCopy;
	}

	/**
	 * If can be condensed to Term, return it
	 * 
	 * @return Term that has been condensed or null if it cannot be
	 */
	public Term condense() {
		//Check if can be condensed
		if(operators.isEmpty()) {
			return terms.get(0);
		}
		return null;
	}
	
}
