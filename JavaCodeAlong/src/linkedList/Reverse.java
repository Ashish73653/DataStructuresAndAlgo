package linkedList;
//import java.util.*;
public class Reverse {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
/*	p,n = null
 * 
 * 			         p  cn
 * 			null<-1<-2  3->4->5->null
 * 			
 * */
	public Node Reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
		
		
	}
	void PrintLinkedList(Node node) {
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<>();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
//		ll.add(5);
//		Collections.reverse(ll);
//		System.out.println(ll);
		
		Reverse list = new Reverse();
		list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        System.out.println("Given linked list");
        list.PrintLinkedList(head);
        head = list.Reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.PrintLinkedList(head);
	}

}
