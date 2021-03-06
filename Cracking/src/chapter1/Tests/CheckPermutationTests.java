package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.CheckPermutation;

public class CheckPermutationTests {

	@Test
	public void test1() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("abc", "cba");
		assertEquals(true, b);
	}
	
	@Test
	public void test2() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("a", "a");
		assertEquals(true, b);
	}
	
	@Test
	public void test3() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("ab", "ac");
		assertEquals(false, b);
	}
	
	@Test
	public void test4() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("abc", "acb");
		assertEquals(true, b);
	}
	
	@Test
	public void test5() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("Ali", "ali");
		assertEquals(false, b);
	}
	
	@Test
	public void test6() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("hello", "heello");
		assertEquals(false, b);
	}
	
	@Test
	public void test7() {
		CheckPermutation cP = new CheckPermutation();
		boolean b = cP.isPermutation("longagowedid", "wedidlongago");
		assertEquals(true, b);
	}


}
