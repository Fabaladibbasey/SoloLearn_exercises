package exercise;

import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String texts = input.nextLine();
		String result = "";
		char letter = 'a';
		String patterns = " 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i = 0; i < texts.length(); i++) {
			letter = texts.charAt(i);
			if(patterns.indexOf(letter) != -1) {
				result += letter;
			}
		}
		
		System.out.println(result);
	}

}
