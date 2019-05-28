package old;

public class Variable {
	Character var = null;
	float degree = 1;
	
	public Variable(Character c, float degree ) {
		if(!Character.isAlphabetic(c)) {
			System.out.println("ERROR! Variable is not Alphabetic");
			System.exit(1);
		}
		var = c;
		this.degree = degree;
	}
}
