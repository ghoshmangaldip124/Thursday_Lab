package myjavaproject;
import java.util.Scanner;

public class GSalary {
	public static void main(String[] args) {
		
		int b_sal=1500;
		float hra,da;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Salary :-");
		int sal=sc.nextInt();
			if(sal>b_sal) {
				hra=sal*0.2f;
				da=sal*0.9f;
			}
			else {
				hra=sal+500;
				da=sal*0.7f;
			}
			System.out.print("Gross Salary :- "+(sal+hra+da));
		}
}