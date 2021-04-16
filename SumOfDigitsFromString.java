package week1.Assignments;

public class SumOfDigitsFromString {
	public static void main(String[] args)
{
	String text="Tes12Le79af65";
	int sum = 0;
	System.out.println(text.replaceAll("[TesLeaf]",""));//replacing the nondigits value to empty string
	String newText = text.replaceAll("[TesLeaf]","");
	char arr[]=newText.toCharArray();//converting them to char array
	for(int i=0;i<arr.length;i++)
		
	{
		//System.out.println(arr[i]);
		int ch=Character.getNumericValue(arr[i]);
		//System.out.println(ch);
		sum=ch+sum;
				
	}
	System.out.println(sum);

}
}
