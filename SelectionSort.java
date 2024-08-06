package text;

public class SelectionSort {
	public static void main(String[] args) {
		
		 int number[] = {6,5,2,8,9,4};
		 int size = number.length;
		 int temp = 0;
		 int min = -1;
		 
	        System.out.println("before sorting");
	        for(int num : number){
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();
	        
	       for(int i=0; i<size-1; i++) {
	    	   
	    	   min = i;
	    	   
	    	   for(int j=i; j<size; j++) {
	    		   
	    		   if(number[min]> number[j])
	    			   min = j;
	    	   }
	    	   
	    	   temp = number[min];
	    	   number[min] = number[i];
	    	   number[i] = temp;
	    	   
	    	   for(int num : number){
		            System.out.print(num + " ");
		        }
	    	   System.out.println();
	    	   
	       }
	        

	        System.out.println();
	        System.out.println();
	        System.out.println("after sorting");
	        for(int num : number){
	            System.out.print(num + " ");
	        }

	}
}
