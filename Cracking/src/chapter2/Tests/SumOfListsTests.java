package chapter2.Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import chapter2.ListNode;
import chapter2.SumOfLists;

public class SumOfListsTests {

	@Test
	public void test1() {
		
		// l1 values {7, 1, 6}
		// l2 values {5, 9, 2}
		int[] sol = {2, 1, 9};
		
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(5);
		
		l1.appendToTail(1);
		l1.appendToTail(6);
		l2.appendToTail(9);
		l2.appendToTail(2);
		
//		ListNode check1 = l1;
//		ListNode check2 = l2;
//		while(check1 != null){
//			System.out.print(check1.data + " ");
//			check1 = check1.next;
//		}
//		
//		System.out.println();
//		
//		while(check2 != null){
//			System.out.print(check2.data + " ");
//			check2 = check2.next;
//		}
//		
//		System.out.println();
		
		SumOfLists s = new SumOfLists();
		ListNode l = s.sumOfLists(l1, l2);
		
		int count = 0;
		while(l != null){
			System.out.print(l.data + " ");
			Assert.assertEquals(sol[count++], l.data);
			l = l.next;
		}
		
		System.out.println();
	}
	
	@Test
	public void test2() {
		
		// l1 values {7}
		// l2 values {5, 9, 2}
		int[] sol = {2, 0, 3};
		
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(5);
		
		l2.appendToTail(9);
		l2.appendToTail(2);
		
		
		SumOfLists s = new SumOfLists();
		ListNode l = s.sumOfLists(l1, l2);
		
		int count = 0;
		while(l != null){
			System.out.print(l.data + " ");
			Assert.assertEquals(sol[count++], l.data);
			l = l.next;
		}
	}
}
