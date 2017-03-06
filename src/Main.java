import java.util.ArrayList;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Tokenizer t = new Tokenizer();
		ArrayList<Lexeme> res = t.THIS(" this)");
		System.out.println(res.size());
		for(Lexeme l : res){
			System.out.println(l.index + " " + l.value + " " + l.token);
		}
	}

}
