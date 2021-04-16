package week1.Assignments;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};//find missing number in an array should not contain any duplicates
		Arrays.sort(arr);//sorting them
		for(int i=0;i<arr.length;i++)
		{
            if(arr[i]+1!=arr[i+1])//checking like one index value and then checking with increment index value
            {
                System.out.println(arr[i]+1);
                break;
            }
			
		}
	}

}
