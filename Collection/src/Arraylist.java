import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi"); 
		list.add("Vijay");  
		list.add("Suman");  
		list.add("Ajay");  

		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
			
			
	}  
}  

