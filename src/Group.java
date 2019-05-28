import java.util.ArrayList;

/**
 * For parenthesis use; A group is everything encapsulated by parenthesis.
 * 
 * @author maxboksem
 *
 */
public class Group {
	//Attributes
	public Number scaler = null;
	public ArrayList<Variable> variables = null;
	
	//Constructor
	private Group() {};
	public Group(Number scaler, ArrayList<Variable> variables) {
		this.scaler = scaler;
		this.variables = variables; //MIGHT HAVE TO MAKE A DEEP COPY
	}
}
