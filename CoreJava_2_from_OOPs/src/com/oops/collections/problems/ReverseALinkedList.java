package com.collections.problems;

public class ReverseALinkedList {
 

	public static void main(String[] args) {
		
		 Node n=new  Node(10);
		n.next=new  Node(20);
		n.next.next=new  Node(30);
		n.next.next.next=new  Node(40);
		System.out.println("before reverse order");
        verify(n);
        
        System.out.println("after reverse order");
        n=reverse(n);
        verify(n); 
        
	}
     
	 static Node reverse(Node head) {
	        Node previous = null;
	        Node current = head;
	        Node nextNode = null;

	        while (current != null) {
	            nextNode = current.next; // Save next
	            current.next = previous; // Reverse current node's pointer
	            previous = current;      // Move previous to this node
	            current = nextNode;      // Move to next node
	        }
	        return previous; // New head
	    }

	static void verify(Node  head) {
		Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.a+" ");
			 temp=temp.next;
		 }
		 System.out.println();
		
	}

}
