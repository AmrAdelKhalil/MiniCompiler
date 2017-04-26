package grammar;

public class Expression_dash2 implements Expression_dash {

	Expression expr;
	
	public Expression_dash2(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue() {
		
		return "[" + expr.getValue() + "]";
	}

}
