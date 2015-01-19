import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class KMP {


	static List<Integer> lps = new ArrayList<Integer>();

	public static void formLPS(String str){

		int len = 0;
		int i = 1;

		lps.add(len,0);

		while(i<str.length())	{
			if(str.charAt(i) == str.charAt(len)){
				len++;
				lps.add(i,len );
				i++;
			}

			else{
				if(len!=0){
					len = lps.get(len-1);
				}

				else{

					lps.add(i, 0);
					i++;
				}


			}
		}
	}


	public static void findMatch(String str,String pat){

		int i = 0;
		int j=0;
		while(i< str.length()){

			if(str.charAt(i) == pat.charAt(j)){
				i++;
				j++;
			}

			if(j== pat.length()){
				System.out.println("patter "+(i-j));
				j= lps.get(j-1);
			}

			else if (i<str.length() && str.charAt(i) != pat.charAt(j)){

				if(j!=0){
					j= lps.get(j-1);
				}
				else
					i = i+1;

			}




		}

	}

	public static void main(String args[]) throws IOException{



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String pat = br.readLine();

		formLPS(str);
		findMatch(str,pat);

		for(Integer i : lps){
			System.out.println(i);
		}
	}
}
