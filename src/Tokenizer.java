import java.util.ArrayList;
import java.util.regex.*;


public class Tokenizer {
	public Pattern pattern = null;
	public Matcher matcher = null;
	public ArrayList<Lexeme> lexemes = new ArrayList<>();
	
	public ArrayList<Lexeme> run(String data){
//		EOL(data);
//		PLUS(data);
//		open_curly_praces(data);
//		close_curly_praces(data);
//		open_square_bracket(data);
//		close_square_bracket(data);
//		open_circle_bracket(data);
//		close_circle_bracket(data);
//		comma(data);
//		semi_colon(data);
//		dot(data);
//		exclamation_mark(data);
//		equal(data);
//		logic_and(data);
//		minus(data);
//		mul(data);
//		less_than(data);
//		greater_than(data);
//		if_condition(data);
//		int_data_type(data);
//		else_condition(data);
		MAIN(data);
		THIS(data);
		TRUE(data);
		COMMENT1(data);
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
		
		pattern = Pattern.compile("\\bif\\b");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"if","IF_CONDITION"));
		}
		
	}
	
	public  void int_data_type(String data){
		
		pattern = Pattern.compile("\\bint\\b");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"int","INT_DATA_TYPE"));
		}
		
	}
	
	public void else_condition(String data){
		
		pattern = Pattern.compile("\\belse\\b");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"else","ELSE_CONDITION"));
		}
		
	}
	
	
	public void MAIN(String data){
		pattern = Pattern.compile("\\bmain[( ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "main", "MAIN"));
		}
	}
	
	public void THIS(String data){
		
		pattern = Pattern.compile("[( ;]?this[.) ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "this", "THIS"));
		}
		
	}
	public void TRUE(String data){
		
		pattern = Pattern.compile("[= (!]true[ );&|=]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "true", "TRUE"));
		}
		
	}
	
	public void VOID(String data){
		
		pattern = Pattern.compile("(^|[ ])void[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "void", "VOID"));
		}
		
	}
	public void CLASS(String data){
		
		pattern = Pattern.compile("(^|[ ])class[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "class", "CLASS"));
		}
		
	}
	public void FALSE(String data){
		
		pattern = Pattern.compile("[= (!]true[ );&|=]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "false", "FALSE"));
		}
		
	}
	
	public void WHILE(String data){
		
		pattern = Pattern.compile("(^|[ ;])while[( ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "while", "WHILE"));
		}
		
	}
	public void LENGTH(String data){
		pattern = Pattern.compile("[. ]length([ ;]|$)");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "length", "LENGTH"));
		}
		
	}
	
	public void PUBLIC(String data){
		
		pattern = Pattern.compile("(^|[ ;])public[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "public", "PUBLIC"));
		}
		
	}
	public void RETURN(String data){
		
		pattern = Pattern.compile("(^|[ ;])return([ ;]|$)");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "return", "RETURN"));
		}
		
	}

	public void STATIC(String data){
		
		pattern = Pattern.compile("[ ]static[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "static", "STATIC"));
		}
		
	}
	public void NEW(String data){
		
		pattern = Pattern.compile("(^|[ (=;])new[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "new", "NEW"));
		}
		
	}
	public void STRING(String data){
		
		pattern = Pattern.compile("(^|[ ;])String[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "string", "STRING"));
		}
		
	}
	public void FLOAT(String data){
		
		pattern = Pattern.compile("(^|[ ;])float[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "float", "FLOAT"));
		}
		
	}
	
	public void CHARACTER(String data){
		pattern = Pattern.compile("(^|[ ;])Character[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "Character", "CHARACTER"));
		}		
	}
	
	public void BOOLEAN(String data){
		
		pattern = Pattern.compile("(^|[ ;])boolean[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "boolean", "BOOLEAN"));
		}
		
	}
	public void EXTENDS(String data){
		
		pattern = Pattern.compile("[ ]extends[ ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "extends", "EXTENDS"));
		}	
	}
	public void SYSTEM_OUT_PRINTLN(String data){
		
		pattern = Pattern.compile("(^|[ ;])System.out.print[ (]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "System.out.print", "SYSTEM.OUT.PRINTLN"));
		}
		
	}
	public ArrayList<Lexeme> INTEGRAL_LITERAL(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "INTEGRAL_LITERAL"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> FLOAT_LITERAL(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "FLOAT_LITERAL"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> STRING_LITERAL(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "STRING_LITERAL"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> ID(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "ID"));
		}
		
		return lexemes;
	}
	public void COMMENT1(String data){
		
		pattern = Pattern.compile("\\/\\/");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "commet 1", "COMMENT1"));
		}
		
	}
	public ArrayList<Lexeme> SINGLE_QUTATION(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "\'"));
		}
		
		return lexemes;
	}
	
	public ArrayList<Lexeme> DOUBLE_QUTATION(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "\""));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> COMMENT2_1(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "/*"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> COMMENT2_2(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "*/"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> CHAR(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "char", "CHAR"));
		}
		
		return lexemes;
	}
	

}
