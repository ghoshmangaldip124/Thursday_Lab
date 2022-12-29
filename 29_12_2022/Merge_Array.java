//Merge two arry
// Author : - Mangaldip Ghosh
package myjavaproject;

public class Merge_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8,9};
		int x=a.length,y=b.length;//x and y length ver
		int z=x+y; // new c index add a+b
		int c[]=new int[z]; // create a new array c
		for(int i=0;i<x;i++) {
			c[i]=a[i]; //merge a array in c
		}
		for(int i=0;i<y;i++) {
			c[x+i]=b[i]; //last a index after merge b
		}
		for(int i=0;i<z;i++) {
			System.out.print(c[i]+" "); //merge array
		}
	}

}
