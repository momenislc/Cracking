package chapter4.Tests;

import org.junit.Test;

import chapter4.BiTreeNode;
import chapter4.MinimalTree;

public class MinimalTreeTests {

	@Test
	public void test1(){
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		MinimalTree mT = new MinimalTree();
		
		BiTreeNode n = mT.createBalancedBiTree(arr);
		
		//printInOrderTraversal(n);
	}
	
	
	@Test
	public void test2(){
		
		int[] arr = {1, 4, 5, 6, 9};
		
		MinimalTree mT = new MinimalTree();
		
		BiTreeNode n = mT.createBalancedBiTree(arr);
		
		printInOrderTraversal(n);
	}
	
	
	private void printInOrderTraversal(BiTreeNode n){
		
		if(n != null){
			printInOrderTraversal(n.leftChild);
			System.out.println(n.val); // vist()
			printInOrderTraversal(n.rightChild);
		}			
	}
}
