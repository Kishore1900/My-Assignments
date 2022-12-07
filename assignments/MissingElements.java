package week2.day2.assignments;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {


			int[] arr = {1,2,3,4,5,7,8,9,10};
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]!=i+1) {
					System.out.println(arr[i]-1);
					break;
			}
			}
			
			
		}

		
	}

