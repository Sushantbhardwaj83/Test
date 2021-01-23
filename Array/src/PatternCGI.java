
public class PatternCGI {
	public static void main(String[] args) {
		int k=1,n=4;
		for(int i=1;i<=n;i++)
		{
			for (int j = 1; j <= n; j++) {
					System.out.print(k+" *");
					k++;
				
			}
			System.out.println();
		}
		
	}
}
