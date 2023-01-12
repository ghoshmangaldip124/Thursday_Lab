//At a fun fair, a street vendor is selling different colours of balloons.
//He sells N number of different colours of balloons (B[]).The task is to
//find the colour (odd) of the balloon which is present odd number of times 
//in the bunch of balloons.

// @ Mangaldip Ghosh

package assignment.in;
import java.util.*;
public class Vendor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the bunch :- ");
		int n=sc.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.print(count);
		}
	}
}
