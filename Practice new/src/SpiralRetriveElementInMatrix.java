
public class SpiralRetriveElementInMatrix {
	static void spiralPrint(int m,int n,int a[][])
	{
		int i,k=0,q=0;

		while (k<m && q<n)
		{
			for (i=q;i<n;i++)
			{
				System.out.print(a[k][i]+" ");//print 1 row
			}
			k++;
			for (i=k;i<m;i++)
			{
				System.out.print(a[i][n-1]+" ");//print last column
			}
			n--;
			if (k<m)
			{
				for (i=n-1;i>=q;i--)
				{
					System.out.print(a[m-1][i]+" ");//print last row
				}
				m--;
			}
			if (q<n)
			{
				for (i=m-1;i>= k;i--)
				{
					System.out.print(a[i][q]+" ");//print first column
				}
				q++;    
			}        
		}
	}
	public static void main (String[] args) 
	{
		int R = 3;
		int C = 6;
		int a[][] = { {1,  2,  3,  4,  5,  6},
				{7,  8,  9,  10, 11, 12},
				{13, 14, 15, 16, 17, 18}};
		spiralPrint(R,C,a);
	}
}

