//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	     int max=Integer.MIN_VALUE,max2=-1,max3=-1;
	     for(int i=0;i<n;i++){
	         if(max<a[i]){
	             max3=max2;
	             max2=max;
	             max=a[i];
	         }else if(max>a[i] && max2<a[i]){
	             max3=max2;
	             max2=a[i];
	         }else if(max3<a[i]){
	             max3=a[i];
	         }
	         
	     }
	     return max3;
    }
}
