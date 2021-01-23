
public class Feb {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int temp=1;
	while(a<=10000)
	{
	
	if(a%2!=0)
	{
	if(a>temp)
	{
		temp=a;
		
	}
	}
	int c=a+b;
	a=b;
	b=c;
		
	}
	System.out.println(temp);
		
	}

}

