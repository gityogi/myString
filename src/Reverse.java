import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reverse {
	
	static void reverseSring(String mystr){
		
		if(mystr.equals(""))
			return;
		
		char c = mystr.charAt(0);
		mystr = mystr.substring(1,mystr.length());
		reverseSring(mystr);
		System.out.print(c);
		
	}
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] mystr = str.toCharArray();
		
		reverseSring(str);
		
		
		
	}

}
