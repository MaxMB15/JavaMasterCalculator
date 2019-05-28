import java.util.ArrayList;

/**
 * A Term is a collection of Groups
 * 
 * @author maxboksem
 *
 */
public class Term {
	//Attributes
	public ArrayList<Group> groups = null;
	
	//Constructor
	private Term() {};
	public Term(ArrayList<Group> groups) {
		this.groups = groups; //MIGHT HAVE TO MAKE A DEEP COPY
	}
}
