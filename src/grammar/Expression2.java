package grammar;

public class Expression2 implements Expression {

	Expression expr;
	Expression_double_dash EDD;
	
	public Expression2(Expression expr, Expression_double_dash EDD) {
		this.expr = expr;
		this.EDD = EDD;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "!" + expr.getValue() + EDD.getValue();
	}

}
