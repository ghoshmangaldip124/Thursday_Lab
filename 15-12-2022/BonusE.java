package myjavaproject;
import java.util.*;
public class BonusE {
	public static void main(String[] args) {
		int j_date,p_date=2022;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Joining Date :- ");
		j_date=sc.nextInt();
		int res=p_date-j_date;
		if(res>3) {
			System.out.print("Bonus is increment 2500");
		}
		else {
			System.out.print("bonus is more then 3 years");
		}
	}

}
