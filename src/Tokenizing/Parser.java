package Tokenizing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import grammar.*;
public class Parser {
	Queue<Lexeme> Tokens = new LinkedList<Lexeme>();
	Parser(Queue<Lexeme>q){
		this.Tokens = q;
	}
	public Goal1 goal1(){
		MainClass1 mainClass = mainClass();
		ClassDeclaration1  classdeclaration = classdeclaration();
		return new Goal1(mainClass,classdeclaration);
	}
	public MainClass1 mainClass(){
		if (Tokens.peek().value.equals("class"))
		{
			Tokens.poll();
			Identifier identefier1 = identefier();
			if (Tokens.peek().value.equals("{"))
			{
				Tokens.poll();
				if (Tokens.peek().value.equals("public"))
				{
					Tokens.poll();
					if (Tokens.peek().value.equals("static"))
					{
						Tokens.poll();
						if (Tokens.peek().value.equals("void"))
						{
							Tokens.poll();
							if (Tokens.peek().value.equals("main"))
							{
								Tokens.poll();
								if (Tokens.peek().value.equals("("))
								{
									Tokens.poll();
									if (Tokens.peek().value.equals("String"))
									{
										Tokens.poll();
										if (Tokens.peek().value.equals("["))
										{
											Tokens.poll();
											if (Tokens.peek().value.equals("]"))
											{
												Tokens.poll();
												Identifier identefier2 = identefier();
												if (Tokens.peek().value.equals(")"))
												{
													Tokens.poll();
													if (Tokens.peek().value.equals("{"))
													{	
														Tokens.poll();
														Statement statement = statement();
														if (Tokens.peek().value.equals("}"))
														{
															Tokens.poll();
															if (Tokens.peek().value.equals("}"))
															{
																Tokens.poll();
																return new MainClass1(identefier1,identefier2,statement);
															}
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}
	
	public ClassDeclaration1  classdeclaration (){
		if (Tokens.peek().value.equals("class"))
		{
			Tokens.poll();
			Identifier identefier1 = identefier();
			Identifier identefier2 = null;
			// handle null in class declration
			if (Tokens.peek().value.equals("extends"))
			{
				Tokens.poll();
				identefier2  = identefier();

			}
			if (Tokens.peek().value.equals("{"))
			{
				Tokens.poll();
				
				ArrayList<VarDeclaration1> varDeclaration1 = new ArrayList<VarDeclaration1>();
				VarDeclaration1 varDeclerationElement = varDeclaration1();
				while(varDeclerationElement != null ){
					varDeclaration1.add(varDeclerationElement);
					varDeclerationElement = varDeclaration1();
				}
				
				ArrayList<MethodDeclaration1> methodDeclaration1 = new ArrayList<MethodDeclaration1>();
				MethodDeclaration1 methodDeclarationElement = methodDeclaration1();
				while(methodDeclarationElement != null ){
					methodDeclaration1.add(methodDeclarationElement);
					methodDeclarationElement = methodDeclaration1();
				}
								
				if (Tokens.peek().value.equals("}"))
				{
					Tokens.poll();
					return new ClassDeclaration1(identefier1, identefier2, varDeclaration1, methodDeclaration1);
				}
			}
		}
		return null;
	}
	public Identifier identefier(){
		return null;
	}
	public Statement statement(){
		return null;
	}
	
	public VarDeclaration1 varDeclaration1(){
		// zero or more
		Type type = type(); 
		Identifier identefier = identefier();
		if (Tokens.peek().value.equals(";"))
		{
			Tokens.poll();
			return new VarDeclaration1(type, identefier);
		}
		return null;
	}
	
	public MethodDeclaration1 methodDeclaration1(){
		// zero or more
		if (Tokens.peek().value.equals("public") || Tokens.peek().value.equals("private"))
		{
			Tokens.poll();
			Type type = type();
			Identifier identefier = identefier();
			if (Tokens.peek().value.equals("("))
			{
				Tokens.poll();
				if (!Tokens.peek().value.equals(")"))
				{
					
				}
				if (Tokens.peek().value.equals(")"))
				{
					Tokens.poll();
					ArrayList<VarDeclaration1> varDeclaration1 = new ArrayList<VarDeclaration1>();
					VarDeclaration1 varDeclerationElement = varDeclaration1();
					while(varDeclerationElement != null ){
						varDeclaration1.add(varDeclerationElement);
						varDeclerationElement = varDeclaration1();
					}
					
					
				}
			}
			
		}
		return null;
	}
	
	public Type type(){
		
		return null;
	}
	
}
