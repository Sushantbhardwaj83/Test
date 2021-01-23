
public class Insert {

	public static void main(String[] args) {
		System.out.println("enter the value");
int ar[]={2,4,6,8,10,12};
int p=4;
int ele=16;
int s[]=insert(ar,p,ele);
for(int i=0;i<s.length;i++)
{
	System.out.print(s[i]);
}
	}
	static int[] insert(int ar[],int p,int ele)
	{
		int a[]=new int[ar.length+1];
		
		for(int i=0;i<a.length;i++)
		{
			if(i<p)
			{
				a[i]=ar[i];
			}
			else if(i>p){
				a[i]=ar[i-1];
			}
			else 
				a[i]=ele;
		}
		return a;
	}

}
