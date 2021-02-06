package exercise;

import java.util.Scanner;

public class SpyLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		decode(message);
	}

	public static void decode(String string) {
		String filteredStr = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char letter;
		String result = "";
		for (int i = string.length() - 1; i > -1; i--) {
			letter = string.charAt(i);
			if (filteredStr.indexOf(letter) != -1) {
				result += letter;
			}
		}

		System.out.println(result);
	}
}
