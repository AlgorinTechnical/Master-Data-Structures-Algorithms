// Java program to print largest contiguous array sum
//Brute Force Solution

import java.io.*;
import java.lang.*;
import java.util.*;

//Function to return Maximum Subarray
public class BruteForce {
	static int maxSubArray(int nums[], int size) {

		//initializing max_so_far to -infinity to keep track of the best subarray
		int max_so_far = Integer.MIN_VALUE;
		
		//Using a for loop that considers each index of the array as a starting point.
		for (int i = 0; i < size; i++) {
			//For each i, creating currentSubarray which will loop through the array and add each element to currentSubarray
			int currentSubarray = 0;
			
			for (int j = i; j < size; j++) {
			
				currentSubarray += nums[j];
				
				//Continuously update max_so_far to contain the maximum out of the currentSubarray and itself.
				max_so_far = Math.max(max_so_far, currentSubarray);
			}
		}
		return max_so_far;
	}

	public static void main (String[] args) throws IOException
	{
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ip);
		int tc = Integer.parseInt(br.readLine().trim());
		while(tc-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			
			for(int i=0; i<n; i++)
			{
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			
			System.out.println(maxSubArray(arr, n));
		}
	}
}



Time complexity: O(N^2), where N is the length of nums.
Space complexity: O(1)




