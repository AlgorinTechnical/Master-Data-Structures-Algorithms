/* 
 * Time complexity: O(N), where N is the length of nums. (We iterate through every element of nums exactly once.)
 * Space complexity: O(1)
 */

import java.io.*;
import java.lang.*;
import java.util.*;

//Function to return Maximum Subarray
public class Optimized {
	static int maxSubArray(int nums[], int size) {
		//Initialize 2 integer variables. Set both of them equal to the first value in the array.
		
		int max_so_far = nums[0]; //max_so_far will be our final return value. Continuously update it whenever we find a bigger subarray.
		int curr_max = nums[0];   //curr_max will keep the running count of the current subarray we are focusing on.
		
		
		//Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables). 	
		for(int i=1; i<size; i++)
		{
			curr_max = Math.max(nums[i], curr_max+nums[i]);  //For each number, add it to the curr_max
			max_so_far = Math.max(curr_max, max_so_far);     //Update max_so_far every time we find a new maximum.
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
