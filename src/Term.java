import java.util.ArrayList;

public class Term {
	
	//ATTRIBUTES
	public String mode = null;											//operation  ~~~ ie: x*2y  mode for 2y is MULT
	public ArrayList<Variable> var = new ArrayList<Variable>();			//any variables along with the degree
	public float scaler = 1.0f;											//scaler
	
	//Decode and convert
	public Term(String s) {
		Term temp = GLOBAL_METHODS.toTerm(GLOBAL_METHODS.decode(s));
		setTerm(temp);
	}
	
	//Set the contents
	public void setTerm(Term t) {
		this.mode = t.mode;
		this.var = t.var;
		this.scaler = t.scaler;
	}
}
