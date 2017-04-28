package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement5 implements Statement {
	Identifier  identifier;
	Identifier_dash identifier_dash;
	
	public Statement5(Identifier  identifier,Identifier_dash identifier_dash){
		this.identifier = identifier;
		this.identifier_dash = identifier_dash;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		// TODO Auto-generated method stub
		return identifier.getValue(q) + identifier_dash.getValue(q);
	}
	

}
