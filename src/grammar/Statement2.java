package grammar;

public class Statement2 implements Statement {
	If_statement if_statement;
	public Statement2(if_statement){
		this.if_statement = if_statement;
	}
	@Override
	public String getValue() {
		return if_statement.getValue();
	}
	

}
