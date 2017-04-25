package grammar;

public class Unmatched1 implements Unmatched{
	Expression expression;
	Unmatched_dash unmatched_dash;
	public Unmatched1(Expression expression,Unmatched_dash unmatched_dash){
		this.expression = expression;
		this.unmatched_dash = unmatched_dash;
	}
	@Override
	public String getValue() {
		return "if("+expression.getValue()+")"+unmatched_dash.getValue();
	}

}
