package exercise;

import java.util.Scanner;

public class AverageWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] lineArr = line.split(" ");
		int wordLength = 0;
		int totalWords = lineArr.length;
		char letter;
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(String word : lineArr) {
			for(int i = 0; i < word.length(); i++) {
				letter = word.charAt(i);
				if(alphabets.indexOf(letter)!= -1) {
					wordLength++;
				}
			}
		}
		
		int averageWordLength = (int) Math.ceil(wordLength / (double) totalWords);
		System.out.println(totalWords);
		System.out.println(wordLength);
		System.out.println(averageWordLength);
	}

}
