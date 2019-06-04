import java.util.ArrayList;

/**
 * For collection of terms
 * 
 * @author maxboksem
 *
 */
public class Matrix {
	//Attributes
	public ArrayList<ArrayList<Expression>> matrix = null;
	
	//Constructor
	private Matrix() {};
	public Matrix(ArrayList<ArrayList<Expression>> matrix) {
		this.matrix = matrix; //MIGHT HAVE TO MAKE A DEEP COPY
	}
	
	//Methods
	public int numRows() {
		if(matrix == null) {
			//If matrix is empty, throw an exception
			try {
				throw new Exception("Matrix is empty... cannot read number of rows.");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		return matrix.get(0).size();
	}
	public int numCols() {
		if(matrix == null) {
			//If matrix is empty, throw an exception
			try {
				throw new Exception("Matrix is empty... cannot read number of cols.");
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
		return matrix.size();
	}

}
