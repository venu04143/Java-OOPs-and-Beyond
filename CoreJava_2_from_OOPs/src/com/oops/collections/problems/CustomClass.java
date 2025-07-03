package com.collections.problems;

class Node{
	int a;
	Node next;
	Node(int a){
		this.a=a;
	}
}
public class CustomClass {

	public static void main(String[] args) {
		Node n=new Node(10);
		n.next=new Node(20);
		n.next.next=new Node(30);
		n.next.next.next=new Node(40);
		n.next.next.next.next=new Node(50);
         int middle= verify(n);
         System.out.println("middle:"+middle);
	}

	 static int verify(Node head) {
		Node slow =head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow.a;
	}

}
