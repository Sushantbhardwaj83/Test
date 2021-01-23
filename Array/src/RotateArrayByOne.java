
public class RotateArrayByOne {
void leftRotatebyOne(int ar[],int n)
{
	int i,temp;
	temp=ar[0];
	for(i=0;i<n-1;i++)
	
		ar[i]=ar[i+1];
		ar[i]=temp;
	
}
void leftRotate(int ar[],int d,int n)
{
	for(int i=0;i<d;i++)
	
		leftRotatebyOne(ar,n);
	
}
void printArray(int ar[],int n)
{
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+"");
	}
}
public static void main(String[] args) {
	RotateArrayByOne ref=new RotateArrayByOne();
	int ar[]={1,2,3,4,5,6,7};
	ref.leftRotate(ar, 4, 7);
	ref.printArray(ar, 7);
}
}
