package linkedList;

public class Linkedlist {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static Linkedlist insert(Linkedlist list,int data) {
		Node newNode = new Node(data);
		
		if(list.head==null) {
			list.head = newNode;
		}else {
			Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = newNode;
		}
		
		return list;
	}
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		
//		Node newNode1 = new Node(1);
//		Node newNode2 = new Node(2);
//		Node newNode3 = new Node(3);
//		
//		Node head = newNode1;
//		newNode1.next = newNode2;
//		newNode2.next = newNode3;
//		newNode3.next = null;
//		
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}

	}

}
