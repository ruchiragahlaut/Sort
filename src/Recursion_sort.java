import java.util.Arrays;

public class Recursion_sort {
	
	 static void NewSort(int arr[], int n) 
	    { 
	        // Base case 
	        if (n <= 1) 
	            return; 
	       
	        // Sort first n-1 elements 
	        NewSort( arr, n-1 ); 
	       
	        // Insert last element at its correct position 
	        // in sorted array. 
	        int last = arr[n-1]; 
	        int j = n-2; 
	       
	        /* Move elements of arr[0..i-1], that are 
	          greater than key, to one position ahead 
	          of their current position */
	        while (j >= 0 && arr[j] > last) 
	        { 
	            arr[j+1] = arr[j]; 
	            j--; 
	        } 
	        arr[j+1] = last; 
	    } 
	      
	    // Driver Method 
	    public static void main(String[] args) 
	    { 
	        int arr[] = {12, 11, 13, 5, 6}; 
	       
	        NewSort(arr, arr.length); 
	          
	        System.out.println(Arrays.toString(arr)); 
	    } 

}
