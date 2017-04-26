package grammar;

public class Statement4 implements Statement {
	Expression expression;
	
	public Statement4(Expression expression){
		this.expression = expression;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		if(q.peek().value.equals("System.out.println"))
		{
			result = q.poll();
			if(q.peek().value.equals("(")){
				result += q.poll();	
				result += expression.getValue(q);
				if(q.peek().value.equals(")")){
					result += q.poll();	
					if(q.peek().value.equals(";")){
						result += q.poll();	
					}
				}
			}
		}
		return result; 
	}

}
