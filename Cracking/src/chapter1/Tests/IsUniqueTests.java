package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.IsUnique;

public class IsUniqueTests {

	@Test
	public void test1() {
		IsUnique iU = new IsUnique();
		boolean b = iU.hasOnlyUniqueCharacters("ABCDE");
		assertEquals(true, b);
	}
	
	@Test
	public void test2() {
		IsUnique iU = new IsUnique();
		boolean b = iU.hasOnlyUniqueCharacters("ABBCDE");
		assertEquals(false, b);
	}
	
	@Test
	public void test3() {
		IsUnique iU = new IsUnique();
		boolean b = iU.hasOnlyUniqueCharacters("AA");
		assertEquals(false, b);
	}
	
	@Test
	public void test4() {
		IsUnique iU = new IsUnique();
		boolean b = iU.hasOnlyUniqueCharacters("ABEDAG");
		assertEquals(false, b);
	}

}
