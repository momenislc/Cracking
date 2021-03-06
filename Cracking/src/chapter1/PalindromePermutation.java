package chapter1;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
 *
 * @author Momeni
 *
 */
public class PalindromePermutation {

	/**
	 * My idea behind this code is that a palindrome should only have either all even numbered
	 * characters or it should only have a single character that is odd. If there is more than 
	 * a single odd numbered character symetry can't be achieved.
	 */
	/**
	 * Checks if any permutation of the input string is a palindrome
	 * @param s
	 * @return
	 */
	public boolean isPalindromePermutation(String s){
		
		char[] inputChars = s.toLowerCase().trim().toCharArray();
		HashMap<Character, Integer> hM = new HashMap<Character, Integer>();
		
		for(char c : inputChars){
			if(c == ' '){
				continue;
			}
			if(hM.containsKey(c)){
				int count = hM.get(c);
				count++;
				hM.put(c, count);
			}else{
				hM.put(c, 1);
			}
		}
		
		boolean containsOne = false;
		for(int i : hM.values()){
			if(i%2 == 0){
				continue;
			} else {
				if(containsOne == false){
					containsOne = true;
				} else {
					return false;
				}
			}			
		}
		return true;
	}
}
