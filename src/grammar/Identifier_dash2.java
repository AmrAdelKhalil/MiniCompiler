package grammar;
import java.util.Queue;
import Tokenizing.Lexeme;

public class Identifier_dash2 implements Identifier_dash{
	Expression left,right;
	public Identifier_dash2(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
	@Override
	public String getValue() {
		String result = "[";
		result += left.getValue();
		result += "]";	
		result += " = ";
		result += right.getValue();
		result += ";\n";
			
		return result;
	}

}
