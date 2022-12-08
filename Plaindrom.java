import java.util.*;
public class Plaindrom{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number :- ");
	int num=sc.nextInt(),revnum=0,reminder;
	int a=num;
		while(num !=0){
		reminder = num % 10;
		revnum = revnum * 10 +reminder;
		num /=10;
		}
		if (a == revnum){
			System.out.print(a+ "number is palindrom");
		}
		else{
			System.out.print(a+ "number is not palindrom");
		}
	}
}