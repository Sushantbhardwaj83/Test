public class Student {
	public static void main(String[] args) {
		Teacher t=new Teacher(); 
		Pen ap=t.givepen();
		System.out.println(ap.getBrand());
		ap.write();
	}

}
