package Tokenizing;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
		INTEGRAL_LITERAL(data);
		FLOAT_LITERAL(data);
		STRING_LITERAL(data);
		ID(data);
		SINGLE_QUTATION(data);
		DOUBLE_QUTATION(data);
		COMMENT2(data);
		COMMENT2_1(data);
		COMMENT2_2(data);
		CHAR(data);
		MAIN(data);
		THIS(data);
		TRUE(data);
		VOID(data);
		CLASS(data);
		FALSE(data);
		WHILE(data);
		LENGTH(data);
		PUBLIC(data);
		RETURN(data);
		STATIC(data);
		NEW(data);
		STRING(data);
		FLOAT(data);
		CHARACTER(data);
		BOOLEAN(data);
		EXTENDS(data);
		SYSTEM_OUT_PRINTLN(data);
		COMMENT1(data);
		SPACE(data);
		
		lexemes.sort(new Lexeme());
		return lexemes;
	}
	
	public void EOL(String data){
		
		pattern = Pattern.compile("\n");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"\\n","EOL"));
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
			lexemes.add(new Lexeme(matcher.start(),"{","LEFT_CURLY_B"));
		}
		
	}
	
	public void close_curly_praces(String data){
		
		pattern = Pattern.compile("\\}");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"}","RIGHT_CURLY_B"));
		}
		
	}
	
	public void open_square_bracket(String data){
		
		pattern = Pattern.compile("\\[");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"[","LEFT_SQUARE_B"));
		}
		
	}
	
	public void close_square_bracket(String data){
		
		pattern = Pattern.compile("\\]");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"]","RIGHT_SQUARE_B"));
		}
		
	}
	
	public void open_circle_bracket(String data){
		
		pattern = Pattern.compile("\\(");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),"(","LEFT_ROUND_B"));
		}
		
	}
	
	public void close_circle_bracket(String data){
		
		pattern = Pattern.compile("\\)");
		matcher = pattern.matcher(data);
		
		while(matcher.find()){
			lexemes.add(new Lexeme(matcher.start(),")","RIGHT_ROUND_B"));
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
			lexemes.add(new Lexeme(matcher.start(),"!","NOT"));
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
		
		pattern = Pattern.compile("\\b\\*(\\b|[\\n])");
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
		pattern = Pattern.compile("\\bmain\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "main", "MAIN"));
		}
	}

	public void THIS(String data){
		
		pattern = Pattern.compile("\\bthis\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "this", "THIS"));
		}
		
	}
	
	public void TRUE(String data){
		
		pattern = Pattern.compile("\\btrue\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "true", "TRUE"));
		}
		
	}
	
	public void VOID(String data){
		
		pattern = Pattern.compile("\\bvoid\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "void", "VOID"));
		}
		
	}
	public void CLASS(String data){
		
		pattern = Pattern.compile("\\bclass\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "class", "CLASS"));
		}
		
	}
	
	public void FALSE(String data){
		
		pattern = Pattern.compile("\\bfalse\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "false", "FALSE"));
		}
		
	}
	
	public void WHILE(String data){
		
		pattern = Pattern.compile("\\bwhile\\b");
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
		
		pattern = Pattern.compile("\\bpublic\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "public", "PUBLIC"));
		}
		
	}
	public void RETURN(String data){
		
		pattern = Pattern.compile("\\breturn\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "return", "RETURN"));
		}
		
	}

	public void STATIC(String data){
		
		pattern = Pattern.compile("\\bstatic\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "static", "STATIC"));
		}
		
	}
	public void NEW(String data){
		
		pattern = Pattern.compile("\\bnew\\b");
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
		
		pattern = Pattern.compile("\\bfloat\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "float", "FLOAT"));
		}
		
	}
	 
	public void CHARACTER(String data){
		pattern = Pattern.compile("\\bchar\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "char", "CHAR"));
		}		
	}
	
	public void BOOLEAN(String data){
		
		pattern = Pattern.compile("\\bboolean\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "boolean", "BOOLEAN"));
		}
		
	}
	public void EXTENDS(String data){
		
		pattern = Pattern.compile("\\bextends\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "extends", "EXTENDS"));
		}	
	}
	public void SYSTEM_OUT_PRINTLN(String data){
		
		pattern = Pattern.compile("\\bSystem.out.println[ (]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "System.out.println", "SYSTEM.OUT.PRINTLN"));
		}
		
	}
	public void INTEGRAL_LITERAL(String data){
		
		//pattern = Pattern.compile("\\b\\d+(?![.\\d])\\b");
		pattern = Pattern.compile("\\b(?<![.\\d])\\d+(?![.\\d])\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "INTEGRAL_LITERAL"));
		}
	}
	public void FLOAT_LITERAL(String data){
		
		pattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(),  matcher.group(), "FLOAT_LITERAL"));
		}
	}
	public void STRING_LITERAL(String data){
		
		pattern = Pattern.compile("\"\\.*\"");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(),  matcher.group(), "STRING_LITERAL"));
		}
	}
	public void ID(String data){ 

		pattern = Pattern.compile("\\b[A-Za-z_]\\w*\\b");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			if(matcher.group().equals("int") || matcher.group().equals("String") || matcher.group().equals("boolean") || 
			   matcher.group().equals("float") || matcher.group().equals("char") ||  matcher.group().equals("if") || 
			   matcher.group().equals("else") || matcher.group().equals("void") || matcher.group().equals("static")
			   || matcher.group().equals("class")|| matcher.group().equals("this") || matcher.group().equals("while")
			   || matcher.group().equals("Character") || matcher.group().equals("main") || matcher.group().equals("public")
			   || matcher.group().equals("new") || matcher.group().equals("extends"))continue;
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "ID"));
		}
	}

	public void COMMENT1(String data){
		
		pattern = Pattern.compile("[/][/].*");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "COMMENT1"));
		}
		
	}
	public void SINGLE_QUTATION(String data){
		
		pattern = Pattern.compile("'");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "'", "SINGLE_QOUTE"));
		}
	}
	
	public void DOUBLE_QUTATION(String data){
		
		pattern = Pattern.compile("\"");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "\"", "DOUBLE_QOUTES"));
		}

	}
	public void COMMENT2(String data){
		
		pattern = Pattern.compile("[/][*].*[*][/]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "COMMENT2"));
		}
	}
	public void COMMENT2_1(String data){
	
		pattern = Pattern.compile("[/][*]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "/*", "COMMENT_L"));
		}
		
	}
	public void COMMENT2_2(String data){
		
		pattern = Pattern.compile("[*][/]");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), "*/", "COMMENT_R"));
		}
		
	}
	public void CHAR(String data){
		
		pattern = Pattern.compile("\'\\.\'");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "A_CHAR"));
		}
	}
	public void SPACE(String data){
		
		pattern = Pattern.compile(" ");
		matcher = pattern.matcher(data);
		
		while (matcher.find()) {
			lexemes.add(new Lexeme(matcher.start(), matcher.group(), "SPACE"));
		}
	}
	

}
