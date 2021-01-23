
public class Exam {

	public static void main(String[] args){
		String s="ram";
		String s1=new  String ("Ram");
		boolean b=s.hashCode()==s1.hashCode();
		System.out.println(b);
	}

}
