//Reverse words in a given string
//Given a string, the task is to reverse the order of the words in the given string. 
//Examples:
//Input: s = “geeks quiz practice code” 
//Output: s = “code practice quiz geeks”
//Input: s = “i love programming very much” 
//Output: s = “much very programming love i”

// @ :- Mangaldip Ghosh

package string.com;
import java.util.*;

public class ReverseString {
	public static void R_String(String s) {
		
		//text is array....store the string
		//split method ---return arry...
		String text[]=s.split(" ");
		
		//rev is blank string
		String rev="";
		for(int i=text.length-1;i>=0;i--) {
			
			//text[i]= index number of array
			//store rev
			rev=rev+text[i]+" ";
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		
		//user define string
		String s = "geeks quiz practice code"; 
		//this is method
		ReverseString.R_String(s);
	}
}
