
package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Identifier1 implements Identifier {

	String token;
	
	public Identifier1(String token) {
		this.token = token;
	}
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		return token;
	}

}
