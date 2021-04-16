package week1.Assignments;

public class OddIndexToUpperCase {
	public static void main(String args[]) {
		String test = "changeme";

		char ch[] = test.toCharArray(); // Here converting string to char array
		// Copy character by character into an array using loop
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 != 0) {
				System.out.println(Character.toUpperCase(ch[i]));
			} else {
				System.out.println(ch[i]);
			}
		}
	}

}