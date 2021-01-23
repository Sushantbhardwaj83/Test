
public class LonelyNumber {

	public static void main(String[] args) {
int a[]={1,2,3,4,5,3,2,1};
find(a);

	}
private	static void find(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
//			System.out.println("S");
			int count=0;
			for(int j=0;j<a.length;j++)
			{
//				System.out.println("R");
				if(a[i]==a[j])
					count++;
			}
				if(count==1)
			System.out.println(a[i]+"");
				
			
		}
	}

}
