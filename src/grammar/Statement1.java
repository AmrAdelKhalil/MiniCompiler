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
	public String getValue() {
		String result = "";
			
		result += " {\n";
		for(int i=0;i<statements.size();i++)
		result += "\t" + statements.get(i).getValue();
		result += "}\n";
		return result;
	}
	

}
