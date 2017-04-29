package grammar;

import java.util.ArrayList;
import java.util.Queue;

import Tokenizing.Lexeme;

public class MethodDeclaration1 implements MethodDeclaration{
	
	ArrayList<Type> types;
	ArrayList<Identifier> identifiers;
	ArrayList<VarDeclaration1> varDeclaration1;
	ArrayList<Statement> statement;
	Expression expression;
	String token;
	
	public MethodDeclaration1(String token,ArrayList<Type> types, ArrayList<Identifier> identifiers, ArrayList<VarDeclaration1> varDeclaration, ArrayList<Statement> statment, Expression expression) {
		this.types = types;
		this.identifiers = identifiers;
		this.varDeclaration1 = varDeclaration;
		this.statement = statment;
		this.expression = expression;
		this.token = token;
	}
	
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
	
		result += token;
		result += types.get(0).getValue(q);
		result += identifiers.get(0).getValue(q);
		result += "(";
		for (int i = 1 ;i<types.size();i++)
			result += types.get(i).getValue(q);
		for(int i = 1 ;i<identifiers.size();i++)
			result +=  identifiers.get(i).getValue(q);
		
		
		result += ")";
		
		result += "{";
		for(int i = 0 ; i < varDeclaration1.size() ; i++){
			result += varDeclaration1.get(i).getValue(q);
		}
		for(int i = 0 ; i < statement.size() ; i++){
			result += statement.get(i).getValue(q);
		}
		result += "return";
		
		result += expression.getValue(q);
		result += ";";
		
		result += "}";
		
		return result;
	}

}
