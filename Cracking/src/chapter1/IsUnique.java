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
		HashSet<Character> hS = new HashSet<Character>();
		
		for(char c : s.toCharArray()){
			
			if(hS.contains(c)){
				return false;
			}
			
			hS.add(c);
		}		
		
		return true;
	}
	
}