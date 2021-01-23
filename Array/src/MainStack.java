
public class MainStack {
	 public static void main(String args[])
	    {
	        Stack s = new Stack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println(s.toString());
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println(s);
	        
	    }
}
