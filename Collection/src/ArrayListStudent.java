import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {
	 int rollno;  
	  String name;  
	  int age;  
	  ArrayListStudent(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  } 
	  public static void main(String args[]){  
		   
		ArrayListStudent s1=new ArrayListStudent(101,"Sonoo",23);  
		ArrayListStudent s2=new ArrayListStudent(102,"Ravi",21);  
		ArrayListStudent s3=new ArrayListStudent(103,"Hanumat",25);  
		  
		  ArrayList<ArrayListStudent> al=new ArrayList<ArrayListStudent>();  
		  al.add(s1);
		  al.add(s2);  
		  al.add(s3);  
		   
		  Iterator itr=al.iterator();  		  
		  while(itr.hasNext()){  
			  ArrayListStudent st=(ArrayListStudent)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
		}
	  

