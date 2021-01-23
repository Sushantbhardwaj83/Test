public class Deleteelement {

	public static void main(String[] args) {
System.out.println("enter the array");
		int ar[]={2,4,6,8,10,12,14,16};
		int in=4;
		int s[]=delete(ar,in);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}
static int[] delete(int ar[],int in)
{
	int a[]=new int[ar.length-1];
	for(int i=0;i<a.length;i++)
	{
		if(i<in)
		{
			a[i]=ar[i];
		}
		else if(i>=in)	
			a[i]=ar[i+1];
		
	}
	return a;
}
}
