import java.util.*;
public class Amstrong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :- ");
		int num=sc.nextInt(),orginalnum,reminder,result = 0;
		orginalnum = num;
		while(orginalnum != 0){
			reminder = orginalnum % 10;
			result += Math.pow(reminder, 3);
			orginalnum /= 10;
			}
		if(result == num){
		System.out.print(num +"is Amstrong Number");
		}
		else{
		System.out.print(num +"is Not Amstrong Number");
		}
	}
}