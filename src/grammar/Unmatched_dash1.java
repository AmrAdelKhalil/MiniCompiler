package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Unmatched_dash1 implements Unmatched_dash{
	Statement statement;
	public Unmatched_dash1(Statement statement) {
		this.statement = statement;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		// TODO Auto-generated method stub
		return statement.getValue(q);
	}
}
