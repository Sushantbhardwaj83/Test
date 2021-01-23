
public class Student1 {
    int id;
	String name;
Student1( int id,String name){
	this.id=id;
	this.name=name;
}
Student1(Student1 s){
	this.id=s.id;
	this.name=s.name;
}
void display(){
	System.out.println(id+""+name);
}
	public static void main(String[] args) {
Student1 s1=new Student1(111,"ram");
Student1 s2=new Student1(s1);
s1.display();
s2.display();
	}

}
