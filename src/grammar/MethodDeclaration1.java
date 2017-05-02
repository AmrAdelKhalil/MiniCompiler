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
	public String getValue() {
		
		String result = "";
	
		result += token + " ";
		result += types.get(0).getValue();
		result += identifiers.get(0).getValue();
		result += "(";
		for (int i = 1 ;i<types.size()-1;i++){
			result += types.get(i).getValue();
			result += identifiers.get(i).getValue();
			result += ", ";
		}
		result += types.get(types.size()-1).getValue();
		result += identifiers.get(identifiers.size()-1).getValue();
//		for(int i = 1 ;i<identifiers.size();i++)
//			result +=  identifiers.get(i).getValue();
		
		
		result += ")";
		
		result += " {\n";
		for(int i = 0 ; i < varDeclaration1.size() ; i++){
			result += "\t" + varDeclaration1.get(i).getValue();
		}
		for(int i = 0 ; i < statement.size() ; i++){
			result += "\t" + statement.get(i).getValue();
		}
		result += "return ";
		
		result += expression.getValue();
		result += ";\n";
		
		result += "}\n";
		
		return result;
	}

}
