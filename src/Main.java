import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Number.makeNumber(4.4).print();
		ExpressionTree t1 = new ExpressionTree(new Term(Number.makeNumber(4), new ArrayList<Variable>()));
		t1.print();
		ExpressionTree t2 = new ExpressionTree(new Term(Number.makeNumber(6), new ArrayList<Variable>()));
		t1.addOperation('+', t2);
		t1.print();
		ExpressionTree t3 = new ExpressionTree(new Term(Number.makeNumber(3), new ArrayList<Variable>()));
		t1.addOperation('*', t3);
		t1.print();
	}

}
