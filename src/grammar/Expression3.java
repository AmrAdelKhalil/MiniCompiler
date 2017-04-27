package grammar;

public class Expression3 implements Expression {

	Expression expr;
	Expression_double_dash EDD;
	
	public Expression3(Expression expr, Expression_double_dash EDD) {
		this.expr = expr;
		this.EDD = EDD;
	}
	
	@Override
	public String getValue() {
		
		return "(" + expr.getValue() + ")" + EDD.getValue();
	}

}
