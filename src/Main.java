import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			String in="";
			Scanner input=new Scanner(new File("input.txt"));
			
			  while (input.hasNextLine()) {
	                String line = input.nextLine();
	                in+=line;
	                in+="\n";
	            }
		System.out.println(in);
		Tokenizer tokens=new Tokenizer();
		ArrayList<Lexeme>res=tokens.run(in);
		for(int i=0;i<res.size();i++)
			System.out.println(res.get(i).index+" "+res.get(i).value);
	}

}
