package week1.Assignments;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='e')
			count++;
		}
		System.out.println("Count" +count);
	}

}
