package chapter2;

public class DeleteMiddleNode {

	public void deleteMiddleNode(Node head){
		
		Node runner = head;
		Node current = head;
		
		int nodeCount = 1;
		
		while(current != null){
			current = current.next;
			nodeCount++;
		}
		
		int index = 0;
		while(index < (nodeCount/2)-1){ // one pos left from the middle
			runner = runner.next;
			index++;
		}
		
		runner.next = runner.next.next; // deleting the middle element
		
		return;
	}
}
