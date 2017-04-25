package grammar;

public class Statement3 implements Statement {
	Expression expression;
	Statement statement;
	public Statement3(Expression expression,Statement statement){
		this.expression = expression;
		this.statement = statement;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "while(" + expression.getValue()+")"+statement.getValue();
	}
	

}
