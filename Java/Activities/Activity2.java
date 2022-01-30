package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
	
		int[] numbers= {10, 77, 10, 54, -11, 10};
		
		System.out.println("Original Array: " + Arrays.toString(numbers));
		
		int searchNum=10;
		int fixedNum=30;
		
		System.out.println("result is:" + result(numbers, searchNum, fixedNum));
         
      }

	public static boolean result(int[] numbers, int searchNum, int fixedNum) {
		int temp=0;
		//int[] numbers = null;
		for(int number : numbers) {
			if(number == searchNum) {
				temp += searchNum;
			}
			if(temp > fixedNum) {
				break;
			}
			
		}
		
		return temp == fixedNum;
	}
		

	}


