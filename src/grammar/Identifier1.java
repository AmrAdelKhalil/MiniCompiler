
package grammar;

public class Identifier1 implements Identifier {

	String token;
	
	public Identifier1(String token) {
		this.token = token;
	}
	@Override
	public String getValue() {
		
		return token;
	}

}
