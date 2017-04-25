package grammar;

public class Statement1 implements Statement {
	Statement statement;
	public Statement1(Statement statement){
		this.statement = statement;
	}
	@Override
	public String getValue() {
		return "{"+statement.getValue()+"}";
	}
	

}
