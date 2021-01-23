
public class RemoveDuplicateValue {

	public static void main(String[] args) {
		String str="aaaBbbCcc";
		
char[] a=str.toCharArray();
char newstr[]=removeduplicate(a);
for(int i=0;i<newstr.length;i++)
	System.out.print(newstr[i]);
	}
static char [] removeduplicate(char a[])
{
	int n=a.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
	}
	char b[]=new char[n];
	for(int i=0;i<n;i++)
	{
		b[i]=a[i];
	}
	return b;
}
}
