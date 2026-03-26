package pr4.interfaces.main;

import pr4.interfaces.model.NumberArray;
import pr4.interfaces.service.CountingSortService;

public class Main {
	 public static void main(String[] args) {
		 int[] arr = {3 , 1 , 4 , 2 , 0 ,5 ,3};
		 
		 NumberArray numbers = new NumberArray(arr);
		 
		 CountingSortService service = new CountingSortService();
		 
		 int[] sorted = service.countingSort(numbers);
		 
		 System.out.println("Sorted array:");
		 for (int num : sorted) {
			 System.out.println(num + " ");
		 }
	 }
}
