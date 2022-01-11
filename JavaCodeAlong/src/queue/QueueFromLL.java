package queue;

public class QueueFromLL {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		Node front,rear;
		public  void enqueue(int data) {
			Node newNode = new Node(data);
			if(front==null) {
				front = rear = newNode;
				return;
			}
			rear.next = newNode;
			rear = newNode;
		}
		public int dequeue() {
			int res;
			if(front==null) {
				System.out.println("Queue underflow");
			}
			res = front.data;
			front = front.next;
			
			return res;
		}
	}
	public static void main(String[] args) {
		QueueFromLL obj = new QueueFromLL();
		Queue qu = new Queue();
		qu.enqueue(12);
		qu.enqueue(2);
		qu.enqueue(5);
		qu.enqueue(7);
		System.out.println(qu.dequeue());
		System.out.println("Front: "+qu.front.data);
		System.out.println("Rear: "+qu.rear.data);
	}

}
