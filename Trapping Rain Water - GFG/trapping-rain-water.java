//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        Stack<Integer> stk=new Stack<>();
        long total=0;
        
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && arr[i]>arr[stk.peek()])
            {
                int top=stk.pop();
                
                if(stk.isEmpty())
                {
                    break;
                }
                
                int w=i-stk.peek()-1;
                int mh=Math.min(arr[i],arr[stk.peek()])-arr[top];
                total+=w*mh;
            }
            stk.push(i);
        }
        
        return total;
    } 
}


