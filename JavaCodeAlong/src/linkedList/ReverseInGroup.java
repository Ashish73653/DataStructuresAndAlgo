package linkedList;

public class ReverseInGroup {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public Node reverse(Node node,int k) {
		if(node==null)return null;
		Node curr = node;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(curr!=null && count<k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next!=null) {
			node.next = reverse(next,k);
		}
		return prev;
	}
	public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
	
	 void printList()
	    {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		ReverseInGroup list = new ReverseInGroup();
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
//		
//		Node head = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//		n8.next = null;
		
		list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
		
		int k = 3;

		 System.out.println("Given Linked List");
	        list.printList();
	 
	        list.head = list.reverse(list.head, 3);
	 
	        System.out.println("Reversed list");
	        list.printList();

	}

}
