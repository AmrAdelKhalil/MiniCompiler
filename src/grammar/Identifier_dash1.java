package grammar;

public class Identifier_dash1 implements Identifier_dash{
	Expression expression;
	public Identifier_dash1(Expression expression){
		this.expression = expression;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "="+expression.getValue()+";";
	}

}
