
public class BigAndSmall {

	
public static void main(String[] args) {
int ar[]={10,30,13,17,78};
int bigger=0;
int smaller=0;
for(int i=0;i<ar.length;i++)
{
	int big=ar[0];
	int small=ar[0];
	if(big<ar[i])
	{
		big=ar[i];
	}
	if(small>ar[i])
	{
		small=ar[i];
	}
	smaller=small;
	bigger=big;
}
System.out.println(smaller);
System.out.println(bigger);




	}

	
}
