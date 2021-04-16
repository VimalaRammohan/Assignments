package week1.Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String newText = null;//going to replace in new string
		int count = 0;

		String[] s1 = text.split(" ");//spliting into string array

		for (int i = 0; i < s1.length; i++)// Array can be print only through iteration and also to get the valur
		{
			System.out.println(s1[i]);//splited value

			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count = count + 1;
				}
				if (count > 1) {//replacing the text with emppty wherever the count becomes increased
					newText = text.replace(s1[i], "");//replacing i values,becoz  i wll be constant
					//within the loop the count will be in some number,so printing within th
					//loop ,if it comes outside the loop,beconmes zer0
				}

			}

		}
		System.out.println(newText);//new string
	}

}
