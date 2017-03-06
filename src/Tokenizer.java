import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
	
	String s = "";
	Pattern p=null;
	boolean f = true;
	public Tokenizer(String s, String p, boolean f){
		this.s = s;
		this.p = Pattern.compile(p);
		this.f = f;
	}
	
	public ArrayList<String> get(){
		ArrayList<String> arr = new ArrayList<String>();
		Matcher m = p.matcher(s);
		int prev = 0;
		
		while(m.find()){
			String r = s.substring(prev, m.start());
			for(int i=0 ; i < r.length() ; i++){
				if(r.charAt(i)!=' '){
					String t ="";
					for(int j = 0 ; j <r.length(); j ++){
						if(r.charAt(j)!=' ')
							t+=r.charAt(j);
					}
					arr.add(t);
					break;
				}
			}
			prev = m.start()+ m.group().length();
			if(!f){
				arr.add(m.group());
			}
		}
		
		return arr;
	}
}
