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
	
	
	public ArrayList<Lexeme> MAIN(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
 		
		pattern = Pattern.compile("\\bmain[( ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "main", "MAIN"));
		}
		
		return lexemes;
	}
	
	public ArrayList<Lexeme> THIS(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("[( ]?this[.) ]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "this", "THIS"));
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> TRUE(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("true");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "[= (]true[ );&|=]", "TRUE"));
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> VOID(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("void");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "void", "VOID"));
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> CLASS(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("class");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "class", "CLASS"));
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> FALSE(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("false");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "false", "FALSE"));
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
		}
		
		return lexemes;
	}
	
	public ArrayList<Lexeme> WHILE(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("while");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "while", "WHILE"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> LENGTH(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("length");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "length", "LENGTH"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> PUBLIC(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("public");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "public", "PUBLIC"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> RETURN(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("return");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "return", "RETURN"));
		}
		
		return lexemes;
	}

	public ArrayList<Lexeme> STATIC(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("static");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "static", "STATIC"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> NEW(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("new");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "new", "NEW"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> STRING(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("string");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "string", "STRING"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> FLOAT(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("float");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "float", "FLOAT"));
		}
		
		return lexemes;
	}
	
	public ArrayList<Lexeme> CHARACTER(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("character");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "character", "CHARACTER"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> BOOLEAN(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("boolean");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "boolean", "BOOLEAN"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> EXTENDS(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("extends");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "extends", "EXTENDS"));
		}
		
		return lexemes;
	}
	public ArrayList<Lexeme> SYSTEM_OUT_PRINTLN(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("System.out.print");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "System.out.print", "SYSTEM.OUT.PRINTLN"));
		}
		
		return lexemes;
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
	public ArrayList<Lexeme> COMMENT1(String data){
		ArrayList<Lexeme> lexemes = new ArrayList<Lexeme>();
		
		pattern = Pattern.compile("");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "", "COMMENT1"));
		}
		
		return lexemes;
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
