package com.jdbc.MySqlJdbc;

import java.util.Scanner;

public class StudentSwitch {
	public static void studentswitch() {
		System.out.println("============STUDENT MANAGEMENT SYSTEM===========");
		
		do {
		System.out.println(" 1. Insert Student Details \n 2. All Student Details \n 3. Update Student \n 4. Delete Student\n 5. Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Menu Number :- ");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			new CreateStudent().createstudent();
			break;
		case 2:
			new getDetails().getdetails();
			break;
		case 3:
			new getUpdate().getupdate();
			break;
		case 4:
			new Delete().delete();
			break;
		case 5:
			System.exit(0);
		}
		System.out.println("=====THANK YOU VISIT US=======");
		}while(true);
	}
}

//new CreateStudent().createstudent();
//
//
//