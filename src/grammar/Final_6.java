package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_6 implements Final_{

	New_dash ND;
	
	public Final_6(New_dash ND) {
		this.ND = ND;
	}
	
	@Override
	public String getValue() {
		String res = "";	
		res += "new ";
		res += ND.getValue();
		return res;
	}

}
