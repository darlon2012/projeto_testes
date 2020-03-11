package teste;

import java.util.regex.Pattern;

public class Teste01 {

	public static void main(String[] args) {
		
      Pattern p = Pattern.compile("");
      String tmp = "Apenas um texto nda mais";
      String[] tokens = p.split(tmp);
        for (int i = 0; i < tokens.length; i++) {
        	System.out.println(tokens[i]);
        }
	     
		
		
	}
	
}
