package exercise;

import java.util.Scanner;

public class DejaVu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(dejaVu(input));
	}

	public static String dejaVu(String str) {
		String result = "Unique";
		char letter;
		char comp;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				comp = str.charAt(j);
				if (letter == comp) {
					count++;
				}
			}
			if (count > 1) {
				result = "Deja Vu";
				break;
			}
			count = 0;
		}

		return result;
	}
}
