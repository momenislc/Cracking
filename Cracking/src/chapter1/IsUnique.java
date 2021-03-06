package chapter1;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * @author Momeni
 *
 */
public class IsUnique {
	
	/**
	 * Checks if a string has only unique characters
	 * @param s
	 * @return true/false
	 */
	public boolean hasOnlyUniqueCharacters(String s) {
		
		boolean[] hS = new boolean[128];
		
		for(char c : s.toLowerCase().toCharArray()){
			
			if(!hS[(int)c]){
				hS[(int)c] = true;
			} else {
				return false;
			}
		}		
		
		return true;
	}
	
}
