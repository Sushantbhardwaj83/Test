import java.util.Arrays;

public class SeparateZeroAndOne {

	public static void main(String[] args) {
		 int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
	        int n = arr.length;
	   int []result = separate_0_1(arr);
	        System.out.println("New Array ");
	        System.out.println(Arrays.toString(result));
	}
	static int [] separate_0_1(int arr[])
    {
       int count = 0;   
     for (int i = 0; i <arr.length; i++)
     {
           if (arr[i] == 0)
               count++;
     }
     for (int i = 0; i < count; i++)
           arr[i] = 0;
     for (int i = count; i <arr.length; i++)
           arr[i] = 1;
   
        return arr;
    }       
}
