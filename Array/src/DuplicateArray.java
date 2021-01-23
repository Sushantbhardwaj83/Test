

public class DuplicateArray {

	public static void main(String[] args) {
int ar[]={4,3,6,8,9,6};
int rs[]=duplicate(ar);
for(int i=0;i<rs.length;i++)
System.out.println(rs[i]);
	}

	static int[] duplicate(int ar[])
	{
		int na[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			na[i]=ar[i];
		}
		return na;
	}
}
