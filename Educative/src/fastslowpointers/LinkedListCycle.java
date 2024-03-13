package fastslowpointers;

public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
	    ListNode slowPointer = head;
	    ListNode fastPointer = head;

	    while(fastPointer!=null && fastPointer.next!= null){
	      slowPointer = slowPointer.next;
	      fastPointer = fastPointer.next.next;

	      if(slowPointer == fastPointer){
	        return true;
	      }
	    }

	    return false;
	  }

	  public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    head.next = new ListNode(2);
	    head.next.next = new ListNode(3);
	    head.next.next.next = new ListNode(4);
	    head.next.next.next.next = new ListNode(5);
	    head.next.next.next.next.next = new ListNode(6);
	    System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

	    head.next.next.next.next.next.next = head.next.next;
	    System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

	    head.next.next.next.next.next.next = head.next.next.next;
	    System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
	  }
	  public static void sort(int[] nums) {
		    int i = 0;
		    while (i < nums.length) {
		      int j = nums[i] - 1;
		      if (nums[i] != nums[j])
		        swap(nums, i, j);
		      else
		        i++;
		    }
	  }
	  
	  private static void swap(int[] arr, int i, int j) {
		  int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
	  }


}



