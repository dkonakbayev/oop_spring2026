package pr4.interfaces.service;

import pr4.interfaces.model.NumberArray;

public class CountingSortService {
	
	public int[] countingSort(NumberArray nums) {
		
		int[] arr = nums.arr;
		int[] count = new int[11];
		
		for (int num : arr) {
			count[num]++;
		}
		
		int[] sorted = new int[arr.length];
		int index = 0;
		
		for (int i = 0 ; i <= 10 ; i++) {
			while (count[i] > 0) {
				sorted[index] = i;
				index++;
				count[i]--;
			}
		}
		
		return sorted;
	}
}
