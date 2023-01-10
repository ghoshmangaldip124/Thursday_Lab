//The function accepts two integers n, m as arguments Find the sum of all numbers in range 
//from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of
// integers not divisible by n with sum of numbers divisible by n.

// @ Mangaldip Ghosh

package thusdaylab.mangal;
import java.util.*;

class SumA{
	public void suma() {
		Scanner sc=new Scanner(System.in);
		int n,m,notDiv=0,Div=0;
		System.out.println("Enter the number (n) :- "); 	// Divisible by 4
		n=sc.nextInt();
		System.out.println("Enter the range 1 to 20 (m)  :- "); //1 tp m range
		m=sc.nextInt();
		for(int i=1;i<=m;i++) { //for loop range
			if(i%n==0) {	// divisible by number
				Div=Div+i; // add the result
			}
			else {
				notDiv=notDiv+i; // not divisible 
			}
		}
		System.out.println("Output is :- "+(notDiv-Div)); //substraction of divisible and not
	}
}

public class DifferenceSum {

	public static void main(String[] args) {
		new SumA().suma();
	}

}
