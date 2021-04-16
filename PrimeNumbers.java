package week1.Assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input=9;
		
boolean res=false;
for(int i=2;i<=input/2;i++)//dividing by 2 only for checking the condition//declaring number divide by 2,so we no need to check upto 7
{
	if(input%i==0)//dividing input for each " for loop" (i)
	{
		res=true;//not prime number condition
		break;
	}}
	if(res)
	{
		System.out.println("NOT Prime numbers");
	}
	else
		System.out.println(" Prime numbers");

}
	

}
