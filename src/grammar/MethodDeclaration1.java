package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class MethodDeclaration1 implements MethodDeclaration{
	
	Type type1, type2;
	Identifier identifier1, identifier2;
	VarDeclaration varDeclaration1;
	Statement statement;
	Expression expression;
	
	public MethodDeclaration1(Type type1, Type type2, Identifier identifier1, Identifier identifier2, VarDeclaration varDeclaration, Statement statment, Expression expression) {
		this.type1 = type1;
		this.type2 = type2;
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.varDeclaration1 = varDeclaration;
		this.statement = statment;
		this.expression = expression;
	}
	
	public String multiParams(Queue<Lexeme> q){
		
		String result = "";
		
		if(q.peek().equals(",")){
			result += ",";
			q.poll();
			result += type2.getValue(q);
			result +=  identifier2.getValue(q);
			result += multiParams(q);
		}
		
		return result;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("public") || q.peek().equals("private")){
			result += q.poll();
			result += type1.getValue(q);
			result += identifier1.getValue(q);
			
			if(q.peek().equals("(")){
				result += "(";
				q.poll();
				result += type2.getValue(q);
				result += identifier2.getValue(q);
				result += multiParams(q);
				
				if(q.peek().equals(")")){
					result += ")";
					q.poll();
					
					if(q.peek().equals("{")){
						result += "{";
						q.poll();
						result += varDeclaration1.getValue(q);
						result += statement.getValue(q);
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
