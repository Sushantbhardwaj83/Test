import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("ram");
		al.add("suman");
		al.add("simran");
		al.add("gagan");
		                            //by iterator interface
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		Iterator itr=al.iterator();
		for(Object obj:al)//by for each loop
		{
			System.out.println(obj);
		}
	}

}
