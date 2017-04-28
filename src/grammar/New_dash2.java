package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class New_dash2 implements New_dash {

	Identifier id;
	
	public New_dash2(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("new")){
			q.poll();
			res += "new";
			res += id.getValue(q);
			if(q.peek().value.equals("(")){
				q.poll();
				res += "(";
				if(q.peek().value.equals(")")){
					q.poll();
					res += ")";
				}
			}
		}
		return res;
	}

}
