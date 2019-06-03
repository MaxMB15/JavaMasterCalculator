import java.util.ArrayList;

/**
 * A Term is a collection of Groups
 * 
 * @author maxboksem
 *
 */
public class Term {
	//Attributes
	public Number scaler = null;
	public ArrayList<Variable> variables = null;
	
	//Constructor
	private Term() {};
	public Term(Number scaler, ArrayList<Variable> variables) {
		this.scaler = scaler;
		this.variables = variables; //MIGHT HAVE TO MAKE A DEEP COPY
	}
}