package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement2 implements Statement {
	If_statement if_statement;
	public Statement2(If_statement if_statement){
		this.if_statement = if_statement;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = if_statement.getValue(q);
		return result;
	}
	

}
