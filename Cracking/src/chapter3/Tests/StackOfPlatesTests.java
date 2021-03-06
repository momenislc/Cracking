package chapter3.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter3.StackOfPlates;

public class StackOfPlatesTests {

	@Test
	public void test() {
		StackOfPlates sP = new StackOfPlates();
			
		for(int i = 0; i < 30; i++){
			sP.push(i);
		}
		
		assertTrue(sP.numberOfPlateStacks() == 3);
		
		for(int i = 0; i < 10; i++){
			sP.pop();
		}
		
		assertTrue(sP.numberOfPlateStacks() == 2);
		
		for(int i = 0; i < 10; i++){
			sP.pop();
		}
		
		assertTrue(sP.numberOfPlateStacks() == 1);
	}

}
