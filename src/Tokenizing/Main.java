package Tokenizing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import grammar.Goal;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String in="";
		Scanner input=new Scanner(new File("input.txt"));
		PrintWriter printWriter = new PrintWriter("output.txt");
		
		while (input.hasNextLine()) {
            String line = input.nextLine();
            in+=line;
            in+="\n";
        }
		Tokenizer tokens=new Tokenizer();
		ArrayList<Lexeme>res=tokens.run(in);
		ArrayList<Lexeme> errors = new ArrayList<Lexeme>();
		Queue<Lexeme> Tokens = new LinkedList<Lexeme>();
		int lastIdx = 0;
		for(int i=0;i<res.size();i++){
			if(!res.get(i).token.equals("SPACE")){
				printWriter.println("<"+res.get(i).token+"> : "+res.get(i).value);
				if(!res.get(i).value.equals("\\n"))
					
					Tokens.add(res.get(i));
			}
			if(i == 0 && res.get(i).index != 0){
				errors.add(new Lexeme(0, in.substring(0,res.get(i).index), "ERROR"));
			}
			if(i != 0){
				if(res.get(i).index > lastIdx){
					errors.add(new Lexeme(lastIdx, in.substring(lastIdx,res.get(i).index), "ERROR"));
				}
			}
			
			if(res.get(i).token.equals("EOL") && res.get(i).index + 1 > lastIdx){
				lastIdx = res.get(i).index + 1;
			} else if (res.get(i).index + res.get(i).value.length() > lastIdx){
				lastIdx = res.get(i).index + res.get(i).value.length();
			}
		}
		/*
		System.out.println("-----------------------------");
		printWriter.println("-----------------------------");
		System.out.println("Errors Number: " + errors.size());
		printWriter.println("Errors Number: " + errors.size());
		
		for(int i=0;i<errors.size();i++){
			System.out.println("<"+errors.get(i).token+"> : "+errors.get(i).value);
			printWriter.println("<"+errors.get(i).token+"> : "+errors.get(i).value);
		}*/
		
		try{
			Parser p = new Parser(Tokens);
			Goal goal = p.goal1();
		
			System.out.println(goal.getValue());
				
		}
		catch(NullPointerException e){
			System.out.println("Syntax Error");
		}
		printWriter.close(); input.close();
	}

}
