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
	
	public MethodDeclaration1(ArrayList<Type> types, ArrayList<Identifier> identifiers, ArrayList<VarDeclaration1> varDeclaration, ArrayList<Statement> statment, Expression expression) {
		this.types = types;
		this.identifiers = identifiers;
		this.varDeclaration1 = varDeclaration;
		this.statement = statment;
		this.expression = expression;
	}
	
	public String multiParams(Queue<Lexeme> q){
		
		String result = "";
		
		if(q.peek().equals(",")){
			result += ",";
			q.poll();
			for (int i = 0 ;i<types.size();i++)
				result += types.get(i).getValue(q);
			for(int i = 0 ;i<identifiers.size();i++)
				result +=  identifiers.get(i).getValue(q);
			result += multiParams(q);
		}
		
		return result;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("public") || q.peek().equals("private")){
			result += q.poll();
		
			result += types.get(0).getValue(q);
			result += identifiers.get(0).getValue(q);
			
			if(q.peek().equals("(")){
				result += "(";
				q.poll();
				
				for (int i = 1 ;i<types.size();i++)
					result += types.get(i).getValue(q);
				for(int i = 1 ;i<identifiers.size();i++)
					result +=  identifiers.get(i).getValue(q);
				
				result += multiParams(q);
				
				if(q.peek().equals(")")){
					result += ")";
					q.poll();
					
					if(q.peek().equals("{")){
						result += "{";
						q.poll();
						for(int i = 0 ; i < varDeclaration1.size() ; i++){
							result += varDeclaration1.get(i).getValue(q);
						}
						for(int i = 0 ; i < statement.size() ; i++){
							result += statement.get(i).getValue(q);
						}
						if(q.peek().equals("return")){
							result += "return";
							q.poll();
							
							result += expression.getValue(q);
							if(q.peek().equals(";")){
								result += ";";
								q.poll();
								
								if(q.peek().equals("}")){
									result += "}";
									q.poll();
								}
							}
						}
					}
				}
			}
		}
		
		return result;
	}

}
