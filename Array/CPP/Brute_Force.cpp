/*
 * Time complexity: O(N^2), where N is the length of nums.
 * Space complexity: O(1)
 */

#include<bits/stdc++.h>
using namespace std;

//Function to return Maximum Subarray
int maxSubArray(int nums[], int size) {

	//initializing max_so_far to -infinity to keep track of the best subarray
    int max_so_far = INT_MIN;
	
	//Using a for loop that considers each index of the array as a starting point.
    for (int i = 0; i < size; i++) {
		//For each i, creating currentSubarray which will loop through the array and add each element to currentSubarray
        int currentSubarray = 0;
		
        for (int j = i; j < size; j++) {
		
            currentSubarray += nums[j];
			
			//Continuously update max_so_far to contain the maximum out of the currentSubarray and itself.
            max_so_far = max(max_so_far, currentSubarray);
        }
    }
    return max_so_far;
}


int main() 
{ 
    int tc;
    cin>>tc;
    while(tc--)
    {
        int n;
        cin>>n;
            
        //Storing elements in the array
        int arr[n];
        for(int i=0; i<n; i++)
        {
            cin>>arr[i];
        }
        cout<<maxSubArray(arr, n)<<endl;
    }
    return 0; 
}
