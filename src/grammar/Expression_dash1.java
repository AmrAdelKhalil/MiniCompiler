package grammar;

public class Expression_dash1 implements Expression_dash {
	
	Expression expr;
	
	public Expression_dash1(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue() {
		return " ( && | < | + | - | * )" + expr.getValue();
		// need to handle
	}

}
