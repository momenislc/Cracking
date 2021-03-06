package chapter1;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are one edit(or zero edits) away.
 *
 * @author Momeni
 *
 */
public class OneAway {

	// THOUGHTS: Okay, so one would be able to grab one of the strings,
	// create all the permutations and then check if the other supplied
	// strings matches any of the variations created. (that would solve the problem)
	// but it would be a dumb approach.
	
	// A second approach would be to initially check the length of both strings
	// if the string length is the same we can assume that it could only be a replacement
	// if a string is shorter or longer it could only be shorter or longer by one character only.
	/**
	 * Checks if two strings are one or zero edits away from being the same
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isOneAway(String s1, String s2){
		
		String iS1 = s1.toLowerCase();
		String iS2 = s2.toLowerCase();
		
		if(iS1.equals(iS2.toLowerCase())){
			return true;
		}
		
		if(Math.abs(iS1.length() - iS2.length()) > 1){
			return false;
		}
		
		// check if the strings are the same length if so we only deal with comparisons and 
		// replacements
		if(iS1.length() == iS2.length()){
			boolean singleReplacement = false;
			
			char[] s1Arr = iS1.toCharArray();
			char[] s2Arr = iS2.toCharArray();
			
			for(int i = 0, j = 0; i < s2Arr.length; i++, j++) {
				
				if((s1Arr[i] != s2Arr[i]) && (singleReplacement == false)){
					s1Arr[i] = s2Arr[i];
					singleReplacement = true;
				} else if(s2Arr[i] != s1Arr[j] && singleReplacement == true) {
					return false;
				}				
			}
			return true;
		} 
		
		if(iS1.length() < iS2.length()){
			boolean singleInsertion = false;
			
			char[] s1Arr = iS1.toCharArray();
			char[] s2Arr = iS2.toCharArray();
			
			for(int i = 0, j = 0; i < s1Arr.length; i++, j++){
				
				if((s1Arr[i] != s2Arr[j]) && (singleInsertion == false)){
					i--;
					singleInsertion = true;
				} else if(s2Arr[i] != s1Arr[j] && singleInsertion == true){
					return false;
				}
			}
			return true;
		}
		
		if(iS2.length() < iS1.length()){
			boolean singleInsertion = false;
			
			char[] s1Arr = iS1.toCharArray();
			char[] s2Arr = iS2.toCharArray();
			
			for(int i = 0, j = 0; i < s2Arr.length; i++, j++){
				
				if((s2Arr[i] != s1Arr[j]) && (singleInsertion == false)){
					i--;
					singleInsertion = true;
					
				} else if (s2Arr[i] != s1Arr[j] && singleInsertion == true){
					return false;
				}
			}
			
			return true;
			
		}
		
		return true;
	}
}
