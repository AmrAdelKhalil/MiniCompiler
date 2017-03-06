import java.util.ArrayList;
import java.util.regex.*;

public class Tokenizer {
	public Pattern pattern = null;
	public Matcher matcher = null;
	public ArrayList<Lexeme> lexemes = new ArrayList<>();
	
	public ArrayList<Lexeme> run(String data){
		EOL(data);
		PLUS(data);
		open_curly_praces(data);
		close_curly_praces(data);
		open_square_bracket(data);
		close_square_bracket(data);
		open_circle_bracket(data);
		close_circle_bracket(data);
		comma(data);
		semi_colon(data);
		dot(data);
		exclamation_mark(data);
		equal(data);
		logic_and(data);
		minus(data);
		mul(data);
		less_than(data);
		greater_than(data);
		if_condition(data);
		int_data_type(data);
		else_condition(data);
		
		return lexemes;
	}
	
	public void EOL(String data){
		
		pattern = Pattern.compile("\n");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"\n","EOL"));
		}
		
	}
	
	public void PLUS(String data){
		
		pattern = Pattern.compile("\\+");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"+","PLUS"));
		}
		
	}
	
	public  void open_curly_praces(String data){
		
		pattern = Pattern.compile("\\{");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"{","OPEN_CURLY_BRACKET"));
		}
		
	}
	
	public void close_curly_praces(String data){
		
		pattern = Pattern.compile("\\}");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"}","CLOSE_CURLY_BRACKET"));
		}
		
	}
	
	public void open_square_bracket(String data){
		
		pattern = Pattern.compile("\\[");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"[","OPEN_SQUARE_BRACKET"));
		}
		
	}
	
	public void close_square_bracket(String data){
		
		pattern = Pattern.compile("\\]");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"]","CLOSE_SQUARE_BRACKET"));
		}
		
	}
	
	public void open_circle_bracket(String data){
		
		pattern = Pattern.compile("\\(");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"(","OPEN_CIRCLE_BRACKET"));
		}
		
	}
	
	public void close_circle_bracket(String data){
		
		pattern = Pattern.compile("\\)");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),")","CLOSE_CIRCLE_BRACKET"));
		}
		
	}
	
	public void comma(String data){
		
		pattern = Pattern.compile("\\,");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),",","COMMA"));
		}
		
	}
	
	public void semi_colon(String data){
		
		pattern = Pattern.compile("\\;");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),";","SEMI_COLON"));
		}
		
	}
	
	public void dot(String data){
		
		pattern = Pattern.compile("\\.");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),".","DOT"));
		}
		
	}
	
	public void exclamation_mark(String data){
		
		pattern = Pattern.compile("\\!");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"!","EXCLAMATION_MARK"));
		}
		
	}
	
	public void equal(String data){
		
		pattern = Pattern.compile("\\=");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"=","EQUAL"));
		}
		
	}
	
	public void logic_and(String data){
		
		pattern = Pattern.compile("\\&&");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"&&","LOGICAL_AND"));
		}
		
		
	}
	
	public  void minus(String data){
		
		pattern = Pattern.compile("\\-");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"-","MINUS"));
		}
		
	}
	
	public void mul(String data){
		
		pattern = Pattern.compile("\\*");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"*","MULTIPLAY"));
		}
		
	}
	
	public void less_than(String data){
		
		pattern = Pattern.compile("\\<");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"<","LESS_THAN"));
		}
		
	}
	
	public  void greater_than(String data){
		
		pattern = Pattern.compile("\\>");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),">","GREATER_THAN"));
		}
		
	}
	
	public void if_condition(String data){
		
		pattern = Pattern.compile("[\\s{} ]if[\b( ]");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"if","IF_CONDITION"));
		}
		
	}
	
	public  void int_data_type(String data){
		
		pattern = Pattern.compile("[\\s ]int[( ]");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"int","INT_DATA_TYPE"));
		}
		
	}
	
	public void else_condition(String data){
		
		pattern = Pattern.compile("[\\s }]else[\\s {]");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"else","ELSE_CONDITION"));
		}
		
	}
	
	
}
