package grammar;
import java.util.Queue;
import Tokenizing.Lexeme;

public class Type10 implements Type{

	@Override
	public String getValue() {
		
		String result = "";
				
		result += "boolean";
			
		result += "[";
				
		result += "] ";
				
		return result;
	}
	
}
