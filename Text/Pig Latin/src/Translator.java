/*
 * Pig Latin - Pig Latin is a game of alterations played on the English language game. 
 * To create the Pig Latin form of an English word the initial consonant sound is transposed 
 * to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay). 
 * Read Wikipedia for more information on rules.
 */

import java.util.*;

public class Translator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String inputString = input.nextLine();
		String[] words = inputString.split(" ");
		
		List<String> translatedWords = new ArrayList<String>();
		for(int x = 0; x < words.length; x++){
			translatedWords.add(pigLatin(words[x]));
		}
		System.out.println(translatedWords);
		input.close();
	}


private static String pigLatin(String w){
	
	String firstChar = String.valueOf(w.charAt(0));
	String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
	String vowels = "AEIOU";

	if(vowels.contains(firstChar.toUpperCase())){
		
		return w + "hay";
		
	} else if(consonants.contains(firstChar.toUpperCase())){
		
		String minusFirst = w.substring(2, w.length());
		String firstCharUpper = w.substring(1, 2);
		return firstCharUpper.toUpperCase() + minusFirst + firstChar.toLowerCase() + "ay";
		
	} else {
		
		return "Input was not a valid word.";
		
	}
}
}