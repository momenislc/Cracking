package chapter2;

public class Palindrome {

public boolean isPalindrome(ListNode list){
		
		if(list == null){
			return false;
		}
		
		int listItemCount = 1;
		
		ListNode researcher = list;
		
		while(researcher.next != null){
			
			researcher = researcher.next;
			listItemCount++;
		}
		
		if(listItemCount == 1){			
			return true;			
		}
		
		ListNode leftComparer = list;
		for(int i = 0 ; i <= (listItemCount%2==1? (listItemCount/2)-1:listItemCount/2); i++){
			if(leftComparer.data == researcher.data){
				leftComparer = leftComparer.next;
				researcher.data = Integer.MAX_VALUE; 
				researcher = leftComparer;
				
				while(researcher.next != null && researcher.next.data != Integer.MAX_VALUE){
					researcher = researcher.next;
				}
				if(i == (listItemCount%2==1? (listItemCount/2)-1:listItemCount/2)){
					return true;
				}
			} else {
				return false;
			}
		}
		
		
		return false;
	}
}
