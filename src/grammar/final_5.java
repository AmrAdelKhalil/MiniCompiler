package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class final_5 implements Final_ {

	Identifier id;
	
	public final_5(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		return id.getValue(q);
	}

}
