package grammar;

public class New_dash1 implements New_dash {

	Expression expr;
	
	public New_dash1(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "int" + "[" +  expr.getValue() + "]";
	}

}
