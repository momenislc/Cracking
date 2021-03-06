package chapter1.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.OneAway;

public class OneAwayTests {

	@Test
	public void test1() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "ple");
		
		assertEquals(true, resultBool);
	}

	@Test
	public void test2() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pales", "pale");
		
		assertEquals(true, resultBool);
	}	
	
	@Test
	public void test3() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "bale");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test4() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "bake");
		
		assertEquals(false, resultBool);
	}
	
	@Test
	public void test5() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "baker");
		
		assertEquals(false, resultBool);
	}
	
	@Test
	public void test6() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "b");
		
		assertEquals(false, resultBool);
	}
	
	@Test
	public void test7() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("pale", "baleee");
		
		assertEquals(false, resultBool);
	}
	
	@Test
	public void test8() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("hey", "heya");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test9() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("", "");
		
		assertEquals(true, resultBool);
	}
		
	@Test
	public void test10() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("allo", "allo");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test11() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("shingus", "shingun");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test12() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("shiz", "bhiz");
		
		assertEquals(true, resultBool);
	}	
	
	@Test
	public void test13() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("shiz", "");
		
		assertEquals(false, resultBool);
	}	
	
	@Test
	public void test14() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("doong", "doog");
		
		assertEquals(true, resultBool);
	}
	
	@Test
	public void test15() {
		
		OneAway t = new OneAway();
		boolean resultBool = t.isOneAway("thedonald", "hedonaldo");
		
		assertEquals(false, resultBool);
	}
}
