import java.util.Scanner;

public class AlternatePrime {

	public static void main(String[] args) {
		int status=1;
		   int num=3;
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
if (n>=1)
	System.out.println(1);
   System.out.println(2);
for(int i=2 ;i<=n;i++)
{
   for ( int j=2;j<=n;j++ )
   {
      if (n%j ==0 )
      {
         status = 0;
         break;
      }
   }
   if ( status!=0 )
   {
      System.out.print(num);
      i++;
   }
   status = 1;
   num++;
}         
}
}


