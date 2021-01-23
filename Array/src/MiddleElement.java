
public class MiddleElement {

	public static void main(String[] args) {
		//System.out.println("enter the array");
		int a[]={5,4,9,1,3};
		middleElement(a);
	}
	public static void middleElement(int a[])
	{ 
		int small=a[0];

	for(int i=0;i<a.length;i++)
	{

		if(a[i]<small)
		{
			small=a[i];

		}

	}
	int s=index(a, small);

	int t=a[a.length/2];
	a[a.length/2]=small;
	a[s]=t;
	System.out.println(s);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}

	}
	
	static int index(int a[],int n)
	{
		System.out.println("n  "+n);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				return i;
			}
		}
		return 0;
	}


}
