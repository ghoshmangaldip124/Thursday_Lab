package myjavaproject;

public class Insert_Element {

	public static void main(String[] args) {
		
		int arr[]= {20,30,40,5,9,56};
		int in=3;
		int a=25;
		for(int i=arr.length-1;i>in-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[in-1]=a;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
