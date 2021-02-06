package exercise;

import java.util.*;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String inputSentence = input.nextLine();
		pigLatin(inputSentence);
	}

	public static void pigLatin(String sentence) {
		String[] words = sentence.split(" ");
		char firstLetter;
		String letterAdded = "ay";
		String subStr = "";
		String finalLetter = "";
		String resultSentence = "";
		for (String word : words) {
			letterAdded = "ay";
			subStr = "";
			finalLetter = "";
			firstLetter = word.charAt(0);
			letterAdded = firstLetter + letterAdded;
			subStr = word.substring(1, word.length());
			finalLetter = subStr + letterAdded;
			resultSentence += finalLetter + " ";

		}

		System.out.println(resultSentence.trim());
	}

}
