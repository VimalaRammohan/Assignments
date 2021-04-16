package week1.Assignments;

import java.util.Arrays;

public class Anagram {
	//rearranging the letters give the another word,it has same set of characters

	public static void main(String[] args) {
String text1="stops";
String text2="potss";

if(text1.length()==text2.length())
{
char arr1[]	=text1.toCharArray();
	char arr2[]=text2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	Arrays.equals(arr1, arr2);
	System.out.print("Anagram");
}else
	if(text1.length()!=text2.length())
	{
	System.out.print("not anagram");	
	}
	}

}
