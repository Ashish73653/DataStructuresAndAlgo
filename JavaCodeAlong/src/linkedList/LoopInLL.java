package linkedList;


public class LoopInLL {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {
		/* 1 & 2: Allocate the Node &
        Put in the data*/
		Node new_node = new Node(data);
		
		/* 3. Make next of new Node as head */
		new_node.next = head;
		
		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	public static boolean detectLoop(Node head) {
		 Node slow_p = head, fast_p = head;
	        int flag = 0;
	        while (slow_p != null && fast_p != null
	               && fast_p.next != null) {
	            slow_p = slow_p.next;
	            fast_p = fast_p.next.next;
	            if (slow_p == fast_p) {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 1)
	            return true;
	        else
	            return false;
	}
	public static void main(String[] args) {
		LoopInLL list = new LoopInLL();
		list.push(1);
		list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
		
		list.head.next.next.next.next = list.head;
		
		if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

	}

}
