package chapter3.Tests;

import org.junit.Test;
import static org.junit.Assert.*;

import chapter3.SortStack;

public class SortStackTests {

	@Test
	public void test() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(5);
		ss.push(4);
		ss.push(3);
		ss.push(2);
		ss.push(1);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	@Test
	public void test2() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(4);
		ss.push(2);
		ss.push(3);
		ss.push(1);
		ss.push(5);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}
	
	@Test
	public void test3() {
		SortStack ss = new SortStack();
		int[] correctVals = {5, 4, 3, 2, 1};
		ss.push(1);
		ss.push(2);
		ss.push(3);
		ss.push(4);
		ss.push(5);
		
		ss.sort();
		
		for(int i = 0; i < 5; i++){
			System.out.print(ss.peek() + " ");
			assertEquals(correctVals[i], ss.pop());
		}
		System.out.println();
	}

}

