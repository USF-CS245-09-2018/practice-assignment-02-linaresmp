


public class BinaryIterativeSearch implements Practice2Search{

	public int search(int[] arr, int target){
	int a = 0;
	int b= arr.length-1	;
	while (a<=b){
		
		int mid = a+b/2;
		
		if (target > arr[mid]){
			a = mid +1;

		}
		if (target < arr[mid]){
			b = mid -1 ; 
		}
		
		
		if(target == arr[mid]){
			return mid;
		}
	}
		return -1;

	}
	public String searchName(){
		return "Binary Iterative search";
	}
	
}