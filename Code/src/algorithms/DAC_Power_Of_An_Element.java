/*

 This program is to find Power of an element using DAC
 
 Input:  Two positive integers a>1, n>=1
 Output: a^n
 
 Time Complexity: Theta(logn)(For Every case)
 Stack Space    : logn
*/


package algorithms;

import java.util.Scanner;

public class DAC_Power_Of_An_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the element: ");
		int a = input.nextInt();
		System.out.print("Enter the power value: ");
		int n = input.nextInt();
		long result = DAC_Power(a,n);
		System.out.print(a+" to the power "+n+" is: "+result);
		input.close();
	}

	private static long DAC_Power(int a, int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return a;
		else {
			long c;
			int mid = n/2;
			long b = DAC_Power(a,mid);
			c = b*b;
			if(n%2==0)
				return c;
			else
				return a*c;
		}
	
	}

}

/*
  
  Enter the element: 2
  Enter the power value: 32
  2 to the power 32 is: 4294967296
  
 */
