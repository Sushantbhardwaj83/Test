
public class Student {
String name;
int id;
Student(String name,int id){
	this.name=name;
	this.id=id;
}

void display(){
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
Student s1=new Student("rakesh",10);
Student s2=new Student("rahul",20);
s1.display();
s2.display();
	}

}
