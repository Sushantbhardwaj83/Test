
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ram";
String s1="shyam";
System.out.println(s==s1);
System.out.println(s.equals(s1));
String s2=new String ("ram");
System.out.println(s==s2);//
System.out.println(s.equals(s2));//
String str=s.concat("fvj");
System.out.println(str);
System.out.println(2-'0');
String st="100gds5420";
int num=0;
for (int i = 0; i<str.length(); i++) 
{ 
    // If a numeric value comes, start converting 
    // it into an integer till there are consecutive 
    // numeric digits 
    if (Character.isDigit(str.charAt(i))) 
        num = num * 10 + (str.charAt(i)-'2');
System.out.println(num);
	}

}}
