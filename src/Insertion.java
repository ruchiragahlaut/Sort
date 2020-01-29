import java.util.Scanner;

//import sorting1.Insertion_sort;
public class Insertion {
	void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
   


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Insertion IS = new Insertion();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array:-");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements of an array:-");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	IS.sort(a);
	IS.printArray(a);
	
    } 

}
