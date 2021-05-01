/*

 Q.) An array of n-elements in which until some position-x all elements are in increasing
     order after x all elements are in decreasing order.
     
     O/P: return X
     
     Linear Search=>n[Worst Case]
     Binary Search=>log(n)
 
*/

package practice;

import java.util.Scanner;

public class Find_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		
		int i = 0;
		int j = ar.length-1;
		int result = findX(ar,i,j);
		System.out.print("At index: "+result);
		input.close();
	}

	private static int findX(int[] ar,int i,int j) {
		// TODO Auto-generated method stub
		int mid = (i+j)/2;
		if((ar[mid-1]<ar[mid]) && (ar[mid]>ar[mid+1]))
			return mid;
		else if(ar[mid]<ar[mid+1])
			return findX(ar,mid+1,j);
		else
			return findX(ar,i,mid-1);
	}

}

/*

 Enter the size of the array: 10
 Enter the elements: 1 2 3 4 5 6 3 2 1 0 
 At index: 5
 
*/