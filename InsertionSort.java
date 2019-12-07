package DataStrucAssignment2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InsertionSort {

	
		// TODO Auto-generated method stub
		/*Function to sort array using insertion sort*/
	    void sort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	  
	            /* Move elements of arr[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
	            } 
	            arr[j + 1] = key; 
	        } 
	    } 
	  
	    /* A utility function to print array of size n*/
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	  
	        System.out.println(); 
	    } 
	  
	    // Driver method 
	    public static void main(String args[]){ 
	    	long start = System.currentTimeMillis();
	        int arr[] = { 148,
	        		706,
	        		15,
	        		94,
	        		32,
	        		11,
	        		207,
	        		16,
	        		87,
	        		
	        		11,
	        		839,
	        		2,
	        		32,
	        		
	        		33,
	        		2,
	        		156,
	        		
	        		8,
	        		
	        		49,
	        		19,
	        		
	        		17,
	        		19,
	        		102,
	        		189,
	        		70,
	        		
	        		17,
	        		510,
	        		
	        		15,
	        		13,
	        		31,
	        		
	        		
	        		52,
	        		
	        		10,
	        		14,
	        		8,
	        		565,
	        		31,
	        		
	        		14,
	        		7,
	        		9,
	        		
	        		9,
	        		75,
	        		116,
	        		42,
	        		218,
	        		13,
	        		1,
	        		16,
	        		39,
	        		245,
	        		34,
	        		
	        		195,
	        		93,
	        		114,
	        		101,
	        		
	        		141,
	        		6,
	        		5,
	        		31,
	        		18,
	        		20,
	        		19,
	        		22,
	        		2,
	        		1,
	        		27,
	        	
	        		87,
	        		187,
	        		182,
	        		276,
	        		45,
	        		
	        		19,
	        		16,
	        		3,
	        		5,
	        		1,
	        		9,
	        		1,
	        		47,
	        		865,
	        		37,
	        		224,
	        		248,
	        		2,
	        		1,
	        		638,
	        		87,
	        		36,
	        		138,
	        		1,
	        		47,
	        		2,
	        		146,
	        		15,
	        		9,
	        		5,
	        		234,
	        		15,
	        		623,
	        		45,
	        		14,
	        		21,
	        		3,
	        		198,
	        		7,
	        		1,
	        		56,
	        		1,
	        		399,
	        		2,
	        		6,
	        		1,
	        		204,
	        		18,
	        		17,
	        		87,
	        		9,
	        		32,
	        		1,
	        		183,
	        		3,
	        		20,
	        		3,
	        		45,
	        		1,
	        		50,
	        		28,
	        		22,
	        		3,
	        		8,
	        		3,
	        		30,
	        		4,
	        		6,
	        		2,
	        		25,
	        		6,
	        		16,
	        		7,
	        		
	        		
	        		10,
	        		18,
	        		
	        		
	        		25,
	        		2,
	        		3,
	        		18,
	        		13,
	        		4,
	        		
	        		12,
	        		104,
	        		4,
	        		17,
	        		2,
	        		3,
	        		2,
	        		3,
	        		3,
	        		32,
	        		
	        		10,
	        		8,
	        		25,
	        		2,
	        		11,
	        		14,
	        		5,
	        		25,
	        		22,
	        		6,
	        		13,
	        		11,
	        		3,
	        		
	        		6,
	        		46,
	        		8,
	        		33,
	        		
	        		4,
	        		8,
	        		14,
	        		10,
	        		51,
	        		12,
	        		4,
	        		26,
	        		82,
	        		12,
	        		12,
	        		21,
	        		56,
	        		14,
	        		27,
	        		3,
	        		14,
	        		29,
	        		2,
	        		27,
	        		7,
	        		11,
	        		1,
	        		21,
	        		28,
	        		15,
	        		1,
	        		30,
	        		7,
	        		21,
	        		14,
	        		56,
	        		30,
	        		16,
	        		1,
	        		1,
	        		2,
	        		1,
	        		330,
	        		8,
	        		36,
	        		578,
	        		39,
	        		204,
	        		9,
	        		1,
	        		8,
	        		1,
	        		172,
	        		58,
	        		1,
	        		86,
	        		1,
	        		105,
	        		29,
	        		218,
	        		14,
	        		2,
	        		2,
	        		1,
	        		42,
	        		42,
	        		6,
	        		1,
	        		14,
	        		12,
	        		13,
	        		
	        		4,
	        		20,
	        		46,
	        		62,
	        		162,
	        		18,
	        		11,
	        		20,
	        		165,
	        		12,
	        		323,
	        		94,
	        	
	        		12,6,
	        		
	        		59,4,
	        		28,
	        		234,
	        		525,
	        		23,
	        		68,
	        		9,
	        		24,
	        		191,
	        		1,
	        		89,
	        		19,
	        		110,
	        		50,
	        		
	        		52,
	        		51,
	        		190,
	        		213,
	        		21,
	        		33,
	        		97,
	        		3,
	        		24,
	        		
	        		9,
	        		3,
	        		
	        		16,
	        		6,
	        		
	        		7,
	        		96,
	        		6 
}; 
	  
	        InsertionSort ob = new InsertionSort(); 
	        ob.sort(arr); 
	  
	        printArray(arr); 
	       long end  = System.currentTimeMillis();

	        NumberFormat formatter = new DecimalFormat("#0.0000");
	        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
	    } 
	}
