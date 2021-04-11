// C++ program to print largest contiguous array sum
//Optimized Solution "Kadane"

#include<bits/stdc++.h>
using namespace std;

//Function to return Maximum Subarray
int maxSubArray(int nums[], int size) {
	//Initialize 2 integer variables. Set both of them equal to the first value in the array.
	
    int max_so_far = nums[0]; //max_so_far will be our final return value. Continuously update it whenever we find a bigger subarray.
    int curr_max = nums[0];   //curr_max will keep the running count of the current subarray we are focusing on.
	
	
	//Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables). 	
    for(int i=1; i<size; i++)
    {
        curr_max = max(nums[i], curr_max+nums[i]);  //For each number, add it to the curr_max
        max_so_far = max(curr_max, max_so_far);     //Update max_so_far every time we find a new maximum.
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



Time complexity: O(N), where N is the length of nums. (We iterate through every element of nums exactly once.)
Space complexity: O(1)
