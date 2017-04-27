package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class ClassDeclaration1 implements ClassDeclaration{

	Identifier identifier1;
	Identifier identifier2;
	VarDeclaration varDeclaration;
	MethodDeclaration methodDeclaration;
	
	public ClassDeclaration1(Identifier identifier1, Identifier identifier2, VarDeclaration varDeclaration, MethodDeclaration methodDeclaration){
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.varDeclaration = varDeclaration;
		this.methodDeclaration = methodDeclaration;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("class")){
			q.poll();
			result += "class";
			result += identifier1.getValue(q);
			
			if(q.peek().equals("extends")){
				q.poll();
				result += "extends";
				result += identifier2.getValue(q);
			}
			
			if(q.peek().equals("{")){
				q.poll();
				result += "{";
				
				result += varDeclaration.getValue(q);
				result += methodDeclaration.getValue(q);
				
				if(q.peek().equals("}")){
					q.poll();
					result += "}";
				}
			}
		}
		return result;
	}

}
