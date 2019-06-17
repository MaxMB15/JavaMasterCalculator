import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println(Number.makeNumber(4.4));
		ExpressionTree t1 = new ExpressionTree(new Term(Number.makeNumber(4), new ArrayList<Variable>()));
	}

}
