import java.util.Comparator;
import java.util.Scanner;

class StudentCompare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of records you want to enter");
     int n=s.nextInt();
String []fN=new String[n];
String []lN=new String[n];
int []per=new int[n];
String []dob=new String[n];

String firstN="";
String lastN="";
int percentage=0;
String dobirth="dd/mm/yyyy";

for(int i=0;i<n;i++)
{	System.out.println("enter the name of records"+(i+1));
	firstN=s.next();
	lastN=s.next();
	percentage=s.nextInt();
	dobirth=s.next();
	fN[i]=firstN;
	lN[i]=lastN;
	per[i]=percentage;
	dob[i]=dobirth;
}
System.out.println("enter  records are");
for(int i=0;i<n;i++)
{	
	System.out.println(fN[i]+lN[i]+per[i]+dob[i]);
}
	}
}