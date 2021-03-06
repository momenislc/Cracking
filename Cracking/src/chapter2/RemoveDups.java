package chapter2;

public class RemoveDups {

	/*
	 * removing duplicates from singly linked list without extra space (eg set)
	 */
	public void removeDups(ListNode head){
		
		ListNode curr = head;
		ListNode runnerPrev;
		
		
		while(curr != null && curr.next != null){
			
			ListNode runner = curr.next;
			runnerPrev = curr;
			
			while(runner != null && runner.next != null){
				
				if(curr.data == runner.data){
					
					runnerPrev.next = runner.next;
					runner = runnerPrev.next.next;

				} else{
					runnerPrev = runner;
					runner = runner.next;
				}
			}
			
			curr = curr.next;
		}		
	}
	
	// NOTE TO SELF: doesn't need curr.next != null checks
	// also only one runner is necessary as runner.next.data can be used to check the next
	// values data to curr.data. if they are equal runner.next = runner.next.next, genius
}
