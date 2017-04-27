package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class VarDeclaration1 implements VarDeclaration{
	
	Type type;
	Identifier identifier;
	
	public VarDeclaration1(Type type, Identifier identifier){
		this.type = type;
		this.identifier = identifier;
	}

	@Override
	public String getValue(Queue<Lexeme> q) {
		String result = "";
		
		result += type.getValue(q);
		result += identifier.getValue(q);
		
		if(q.peek().equals(";")){
			q.poll();
			result += getValue(q);
		}
		return result;
	}
	
	
}
