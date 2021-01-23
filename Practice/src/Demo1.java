
public class Demo1 {

	public static void main(String[] args) {
String s1="30";
String s3="20";
/*System.out.println(s1.equals(s3));
System.out.println(s1==s3);*/

System.out.println(s1==s3);
System.out.println(s1.equals(s3));
String s4=new String( "hello");
String s5=new String("hello");
System.out.println(s4==s5);//f
System.out.println(s4.equals(s5));//t
	}

}
