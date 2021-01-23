class Student121{  
	int rollno;  
	String name;  
	String city;  

	Student121(int rollno, String name, String city){  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city; 
		System.out.println( this.rollno+this.name+ this.city);
	}  
	public static void main(String args[]){  
		Student121 s1=new Student121(101,"Raj","lucknow");  
		Student121 s2=new Student121(102,"Vijay","ghaziabad");  
	}  
}  