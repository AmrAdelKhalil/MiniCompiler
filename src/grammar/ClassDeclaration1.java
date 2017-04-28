package grammar;

import java.util.ArrayList;
import java.util.Queue;

import Tokenizing.Lexeme;


public class ClassDeclaration1 implements ClassDeclaration{

	Identifier identifier1;
	Identifier identifier2;
	ArrayList<VarDeclaration1> varDeclaration;
	ArrayList<MethodDeclaration1> methodDeclaration;
	
	public ClassDeclaration1(Identifier identifier1, Identifier identifier2, ArrayList<VarDeclaration1> varDeclaration, ArrayList<MethodDeclaration1> methodDeclaration){
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
				for (int i = 0 ; i < varDeclaration.size() ; i++){
					result += varDeclaration.get(i).getValue(q);
				}

				for (int i = 0 ; i < varDeclaration.size() ; i++){
					result += methodDeclaration.get(i).getValue(q);
				}
				
				if(q.peek().equals("}")){
					q.poll();
					result += "}";
				}
			}
		}
		return result;

	}

}
