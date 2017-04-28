package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_6 implements Final_{

	New_dash ND;
	
	public Final_6(New_dash ND) {
		this.ND = ND;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("new")){
			q.poll();
			res += "new";
			res += ND.getValue(q);
		}
		return res;
	}

}
