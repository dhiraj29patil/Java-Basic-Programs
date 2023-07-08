package com.doublelinkedlist;

public class DoublyLinkedList {
	public static class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
	}
	public static void display(Node head){
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public static void displayRev(Node tail) {
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
	public static void displayRandom(Node head) {
		Node temp = head;
		while(temp.prev != null) {
			temp = temp.prev;
		}
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node insertAtHead(Node head, int num) {
		Node newNode = new Node(num);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		return head;
	}
	public static void insertAtTail(Node head, int num) {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(num);
		temp.next = newNode;
		newNode.prev = temp;
		
	}
	public static void insertAtPos(Node head, int pos, int val) {
		Node s = head;
		for(int i = 1; i <= pos-1; i++) {
			s = s.next;
		}
		Node r = s.next;
		Node newNode = new Node(val);
		newNode.next = r;
		r.prev = newNode;
		newNode.prev = s;
		s.next = newNode;
	}
	public static void deleteAtLast(Node head) {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node s = temp.prev;
		s.next = null;
	}
	public static void deleteAtFirst(Node head) {
		head = head.next;
		head.prev = null;
		
	}
	public static void deleteAtPos(Node head, int pos) {
		Node temp = head;
		for(int i = 1; i <= pos; i++) {
			temp = temp.next;
		}
		Node s = temp.prev;
		Node r = temp.next;
		r.prev = s;
		s.next = r;
		
	}
	public static void main(String[] args) {
		Node a = new Node(4);
		Node b = new Node(10);
		Node c = new Node(2);
		Node d = new Node(6);
		Node e = new Node(1);
		a.prev = null;
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next = null;
//		display(a);
//		displayRev(e);
//		displayRandom(c);
//		Node newNode = insertAtHead(a, 30);
//		display(newNode);
//		insertAtTail(a,15);
//		insertAtTail(a,18);
//		display(newNode);
//		insertAtPos(a, 3, 88);
//		insertAtPos(a, 1, 58);
//		deleteAtLast(a);
//		insertAtTail(a,18);
//		deleteAtLast(a);
//		deleteAtLast(a);
//		display(a);
//		deleteAtFirst(a);
		deleteAtPos(a, 1);
		display(a);
	}
}
