package Activities;

import java.util.Arrays;

public class Activity4 {
	static void sort(int array[]) {
        int size = array.length;
        
        int temp=0;
        int j;
        for (int i = 1; i < size; i++) {
        	
        	temp=array[i];
        	j=i;
        	while(j>0 && array[j-1]>temp) {
        		array[j]=array[j-1];
        		j=j-1;
        	}
        	array[j]=temp;
        
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 5,0, 6, 8, 9, 1, 7 };
        sort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}


