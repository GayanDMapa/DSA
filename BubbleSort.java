package text;

public class BubbleSort {

	public static void main(String[] args) {
		
		 int number[] = {6,5,2,8,9,4};
		 int size = number.length;
		 int temp = 0;
		 
	        System.out.println("before sorting");
	        for(int num : number){
	            System.out.print(num + " ");
	        }
	        
	        for(int i=0; i<size; i++) {
	        	for (int j=0; j<size-1; j++) {
	        		if(number[j] > number[j+1]) {
	        			temp =number[j];
	        			number[j] = number[j+1];
	        			number[j+1] = temp;
	        		}
	        	}
	        }

	        System.out.println();
	        System.out.println();
	        System.out.println("after sorting");
	        for(int num : number){
	            System.out.print(num + " ");
	        }

	}

}
