import java.util.Scanner;

public class A {
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
char []ch=str.toCharArray();
for(int i=1;i<ch.length;i+=2)
{
	for(int j=0;j<ch[i]-48;j++)
	{
		System.out.print(ch[i-1]);
	}
}
}
}
