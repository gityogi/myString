import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MaxChar {

	
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Map<Character,Integer> mymap = new HashMap<Character,Integer>();
		
		int len = str.length();
		int i = 0;
		
		while(i<len){
			
			if(!mymap.containsKey(str.charAt(i))){
				
				mymap.put(str.charAt(i), 1);
			}
			
			else
				
				mymap.put(str.charAt(i), mymap.get(str.charAt(i))+1);
							
			i++;
		}
		
		 int maxValueInMap=(Collections.max(mymap.values()));
		 System.out.println("max value "+maxValueInMap);
		 
		 //Iterating over map using Entry(Collection)....
		 
		 
		 for(Entry<Character,Integer> entry : mymap.entrySet()){
			 
			 if(entry.getValue() == maxValueInMap)
				 System.out.println(entry.getKey());
			 
		 }
		
		
		
	}
	
}
