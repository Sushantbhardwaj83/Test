
public class CompareArray {

	public static void main(String[] args) {
int a[]={2,4,6,8,12,13};
int b[]={2,4,6,8,10,12};
boolean rs=compareArra(a,b);
System.out.println(rs);
	}
static boolean compareArra(int a[],int b[])
{
	if(a.length!=b.length)
	{
		return false;
	}
	return true;
}
}
