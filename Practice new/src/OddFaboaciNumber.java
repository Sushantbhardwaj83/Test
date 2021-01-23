import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class OddFaboaciNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int a=1, b=1;int k=0;
		ArrayList<Integer> list = new ArrayList<Integer>(n); 
		while(k<=n){
			k=a+b;
			if(k>=n){
				break;
			}
			list.add(k);
			a=b;
			b=k;
		}
		//System.out.println(list);
		for (int i=0;i<list.size();i++){      
		       int even=list.get(i)%2;       
		        if (even==0){
		            list.remove(i);
		        }    
		    }
		System.out.println(list);
		System.out.print("Largest odd fabonaci no is:  ");
		System.out.print(list.get(list.size()-1));
}
}