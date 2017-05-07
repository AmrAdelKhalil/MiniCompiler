package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Matched2 implements Matched{
	Statement statement;
	public Matched2(Statement statement){
		this.statement = statement;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return statement.getValue();
	}

}
