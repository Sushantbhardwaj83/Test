import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

int[]arr = {51,67,27,21,53,38,97,70,89,97,105 };
int n=arr.length;

  orderArray(arr,n);
	}

	private static void orderArray(int[]arr,int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-5;i++)
		
		System.out.print(arr[i]+" ");
		
	 for (int j = n-1; j>=n/2;j--)
			    
	 System.out.print(arr[j]+" ");
			    
		
	}

}
