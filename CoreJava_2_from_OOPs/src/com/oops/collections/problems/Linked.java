package com.collections.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.collections.problems.Linked.Node;

public class Linked {
	
	Node head;
	Node tail;
	Node prev;
	
	Linked(){
		
	}
	
	class Node {
		private Node prev;
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		
	}

	public void add(int value) {
		Node n  = new Node(value);
        if(head==null) {
			head=n;
			head.prev=null;
			head.next=tail;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
			n.next=tail;		
		}  
	}
	
	
	public int middle() {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.value;
	}
	public void display() {
		Node node =head;
		
		while(node !=null) {
			System.out.print(node.value);
			if(node.next!=null) {
				System.out.print("->");
			}
			node=node.next;
		}
	}
	
     public static void main(String[] args) {
		
		
    	Linked list = new Linked();
    	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.display();
		System.out.println();
		System.out.println("Middle value of Linked List "+list.middle());
		
		list.reverse();
		
		list.display();
	}

     public void reverse() {
         Node curr = head;
         Node temp = null;

         while (curr != null) {
             // Swap next and prev
             temp = curr.prev;
             curr.prev = curr.next;
             curr.next = temp;
             // Move to next node (originally prev)
             curr = curr.prev;
         }
         // After loop, set head to last processed node
         if (temp != null) {
             head = temp.prev;
         }
     }
}
