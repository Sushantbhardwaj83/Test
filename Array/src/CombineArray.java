
public class CombineArray {

	public static void main(String[] args) {
int a[]={2,4,6,8};
int b[]={3,6,9,12,14};
int rs[]=combine(a,b);
for(int i=0;i<rs.length;i++)
	System.out.print(rs[i]);
	}
	static int[] combine(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		return c;
	}

}
