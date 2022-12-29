//Sorting array
//Author :- Mangaldip Ghosh
package myjavaproject;

public class Sort_Array {
	public static void main(String[] args) {
		int temp=0;
		int arr[]= {7,6,5,4,3,2,1};
		for(int i=0;i<arr.length;i++) {  //for first index i
			for(int j=i+1;j<arr.length;j++) {  //for second index j
				if(arr[i]>arr[j]) { //compaer 1st and 2nd element
					temp=arr[i];
					arr[i]=arr[j]; //swap to vlue
					arr[j]=temp;
					
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}
