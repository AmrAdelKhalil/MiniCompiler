package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;


public class Goal1 implements Goal{
	
	MainClass mainClass;
	ClassDeclaration classDeclaration;
	
	public Goal1(MainClass mainClass, ClassDeclaration classDeclaration){
		this.mainClass = mainClass;
		this.classDeclaration = classDeclaration;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
	    result = mainClass.getValue(q);
	    
	    result+= classDeclaration.getValue(q);
	    
	    if(q.size() != 0){
	    	return "ERROR";
	    }
	    
	    return result;
	    
	}
}
