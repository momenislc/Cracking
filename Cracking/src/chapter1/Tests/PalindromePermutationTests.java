package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.PalindromePermutation;

public class PalindromePermutationTests {

	@Test
	public void test1() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Tact Coa");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test2() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("My gym");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test3() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Red rum sir is murder");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test4() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Solos");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test5() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Sagas");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test6() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Saas");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test7() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Step on no pets");
		
		assertEquals(true, b);
	}
	
	@Test
	public void test8() {
		PalindromePermutation pP = new PalindromePermutation();
		
		boolean b = pP.isPalindromePermutation("Step on no petsni");
		
		assertEquals(false, b);
	}

}
