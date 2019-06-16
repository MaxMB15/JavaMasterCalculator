package old;
import java.util.ArrayList;

/**
 * This class is used for combining two terms with some operator logic
 * 
 * @author maxboksem
 *
 */
public class Operator {
	//Methods
	//Single
	public static Expression add(Term t1, Term t2) {	//addition		//EXAMPLE: "4x+4y"
		//Empty lists to fill expression
		ArrayList<Term> termList = new ArrayList<Term>();
		ArrayList<Character> opList = new ArrayList<Character>();
		
		if(t1.isTermVarsEqual(t2)) {		//If the variables are matching
			termList.add(new Term(new Decimal(t1.scaler.getValue() + t2.scaler.getValue()), new ArrayList<Variable>(t1.variables)));
		}
		else {
			termList.add(t1);
			opList.add('+');
			termList.add(t2);
		}
		return new Expression(termList, opList);
	}
	public static Expression add(Term t, Expression e) {	//addition		//EXAMPLE: "7x+(4y+4)"
		Expression result = e.makeDeepCopy();		//Make a base copy
		boolean likeTerm = false;					//Check to see if term has been added
		
		//Look through terms to add
		
		
		
		
		//return the result
		return result;
	}
	public static Expression add(Expression e1, Expression e2) {	//addition		//EXAMPLE: "7x+(4y+4)"
		//Make a base copy
		Expression result = e1.makeDeepCopy();
		
		
		
		//return the result
		return result;
	}
	public static Term sub(Term t1, Term t2) {	//subtraction
		return null;
	}
	public static Term mult(Term t1, Term t2) {	//multiplication
		return null;
	}
	public static Term div(Term t1, Term t2) {	//division
		return null;
	}
	public static Term pow(Term t1, Term t2) {	//power
		return null;
	}
	//Matrices
	public static Term add(Matrix t1, Matrix t2) {	//addition
		return null;
	}
	public static Term sub(Matrix t1, Matrix t2) {	//subtraction
		return null;
	}
	public static Term mult(Matrix t1, Matrix t2) {	//multiplication
		return null;
	}
}
