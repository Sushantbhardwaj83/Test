//import InsertionInLinkedList.Node;

public class SimpleLinkedList {
	    Node head;  // head of list
	 
	    /* Linked list Node. This inner class is made static so that
	       main() can access it */
	    static class Node {
	        int data;
	        Node next;
	        Node(int d)  { data = d;  next=null; } // Constructor
	    }
	 
	    /* method to create a simple linked list with 3 nodes*/
	    public static void main(String[] args)
	    {
	        /* Start with the empty list. */
	       SimpleLinkedList llist = new SimpleLinkedList();
	 
	        llist.head  = new Node(1);
	        Node second = new Node(2);
	        Node third  = new Node(3);
	        Node fourth  = new Node(4);
	 
	        llist.head.next = second; // Link first node with the second node
	 
	        second.next = third; // Link second node with the third node
	        third.next = fourth; // Link second node with the third node
	    llist.printList();
	    }

		private void printList() {
			// TODO Auto-generated method stub
			Node n = head;
			while (n != null)
			{
				System.out.print(n.data+" ");
				n = n.next;
			}
		}
	}
