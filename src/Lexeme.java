
public class Lexeme {
	public int index;
	public String value;
	public String token;
	
	public Lexeme() {
		this.index = -1;
		this.value = "";
		this.token = "";
	}

	public Lexeme(int index, String value, String token) {
		this.index = index;
		this.value = value;
		this.token = token;
	}
}
