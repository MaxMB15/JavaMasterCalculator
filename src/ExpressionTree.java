/**
 * This class represents terms with their order of operation in a Binary Search Tree
 * 
 * @author maxboksem
 *
 */
public class ExpressionTree {
	//Attributes
	private Character operator = null;
	private ExpressionTree left = null;
	private ExpressionTree right = null;
	private Term data = null;
	private boolean isLeaf = true;
	
	//Constructors
	/**
	 * An ExpressionTree with just one Term leaf node
	 * 
	 * @param t
	 */
	public ExpressionTree(Term t) {
		data = t;
	}
	/**
	 * A deep copy of an expression tree
	 * 
	 * @param op
	 * @param left
	 * @param right
	 * @param t
	 */
	private ExpressionTree(Character op, ExpressionTree left, ExpressionTree right) {
		this.left = left.deepCopy();
		this.right = right.deepCopy();
		this.operator = new Character(op);
		this.isLeaf = false;
	}
	
	private ExpressionTree() {}
	
	//Methods
	
	public boolean isLeaf() {
		return isLeaf;
	}
	
	/**
	 * 
	 * This method pushes the current tree down and adds the new operator and new Expression tree
	 * 
	 * Example:  current tree:    *			parameters = (+,ExpressionTree(4))
	 * 							 / \
	 * 							6   7
	 * 
	 * 			 new tree:		  +
	 * 							 / \
	 * 							*   4
	 * 						   / \
	 * 						  6   7
	 * 
	 * @param operator The operator that gets added to the Expression tree
	 * @param t The ExpressionTree you want to add
	 */
	public void addOperation(Character operator, ExpressionTree t) {
		left = this.deepCopy();
		right = t.deepCopy();
		this.operator = operator;
		this.data = null;
		this.isLeaf = false;
	}
	/**
	 * 
	 * @return returns a deep copy of the ExpressionTree
	 */
	public ExpressionTree deepCopy() {
		if(isLeaf()) {
			return new ExpressionTree(this.data.deepCopy());
		}
		else{
			return new ExpressionTree(this.operator, this.left, this.right);		
		}
	}
	/**
	 * 
	 * @return returns a visual of the ExpressionTree in a directory like fashion
	 */
	public void print() {
		//Print object type
		System.out.println("ExpressionTree:");
		
		//Print the info
		printRL(0, 4, "ROOT: ",this);
	}
	private void printRL(int currentSpaces, int tabAmount, String prefix, ExpressionTree tree) {
		//Print the current spaces
		String indentString = "";
		for(int s = 0; s < currentSpaces+tabAmount; s++)
			indentString += ' ';
		
		//Check if LeafNode
		if(tree.isLeaf())
			System.out.println(indentString + prefix + tree.data.toString());
		else {
			System.out.println(indentString + prefix + tree.operator.toString());
			printRL(currentSpaces + tabAmount, tabAmount, "L: ", tree.left);
			printRL(currentSpaces + tabAmount, tabAmount, "R: ", tree.right);			
		}
		
		
	}
	
}
