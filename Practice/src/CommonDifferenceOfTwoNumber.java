import java.util.Scanner;

public class CommonDifferenceOfTwoNumber {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
	    System.out.print("Enter the 1st number(larger number) :  ");
	    int y=x.nextInt();
	    System.out.print("Enter the 2nd number : ");
	    int z=x.nextInt();

	    int ar1[]=new int[y];
	    int ar2[]=new int[z];

	    for( int i=1;i<y;i++){ //puts the divisors of the larger number to an array ar1[]
	         int l=y%i;
	         if(l==0)
	           ar1[i]=i;}

	    for( int i=1;i<z;i++){//puts the divisors of the other number to an array ar2[]
	        int l=z%i;
	        if(l==0)
	          ar2[i]=i;}System.out.print("Common divisors of "+y+", "+z+" = ");

	    for(int i=1;i<=ar2.length-1;i++){ //printing the common elements of both arrays.
	     if((ar1[i]==ar2[i])&&ar2[i]!=0)
	        System.out.print(i+" ");
	}}}
	