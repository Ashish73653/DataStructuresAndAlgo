package linkedList;

public class SwapInTwo {

	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	void PrintLinkedList(Node node) {
		while(node!=null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	public void swapInTwo() {
		Node temp = head;
		while(temp!=null && temp.next!=null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
		
	}
	public static void main(String[] args) {
		SwapInTwo ll = new SwapInTwo();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.PrintLinkedList(head);
		ll.swapInTwo();
		ll.PrintLinkedList(head);
	}

}
