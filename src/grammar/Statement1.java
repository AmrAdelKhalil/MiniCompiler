package grammar;

import java.util.ArrayList;
import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement1 implements Statement {
	ArrayList<Statement> statements = new ArrayList<Statement>();
	public Statement1(ArrayList<Statement> statements){
		this.statements = statements;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
			
		result += "{";
		for(int i=0;i<statements.size();i++)
		result += statements.get(i).getValue(q);
		result += "}";
		return result;
	}
	

}
