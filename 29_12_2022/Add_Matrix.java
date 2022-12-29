//Additiom two matrix
//Author :- Mangaldip Ghosh
package myjavaproject;

public class Add_Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{8,9,7}}; //1st matrix
		int b[][]= {{7,8,9},{9,8,5},{8,6,7}}; //2nd matrix
		int arr[][]=new int[3][3];
		System.out.println("This is First Matrix :-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" "); //print 1st matrix
			}
			System.out.println(" ");
		}
		System.out.println("This is First Matrix :-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" "); //print 2nd matrix
			}
			System.out.println(" ");
		}
		System.out.println("Addation matrix is :-");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=a[i][j]+b[i][j]; //Additiom two matrix
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
