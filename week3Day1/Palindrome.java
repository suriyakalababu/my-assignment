package week3Day1;

public class Palindrome {

	public static void main(String[] args) {

		String original = "madam";

		String rev = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);

		}
		if (original.equals(rev)) {
			System.out.println(original + "is a palindrome");

		} else {
			System.out.println(original + "is  not a palindrome");

		}

	}

}
