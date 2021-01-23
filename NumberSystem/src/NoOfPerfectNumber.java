import java.util.Scanner;
public class NoOfPerfectNumber {
	

		public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("enter the no");
			int x=s.nextInt();
			for(int i=1;i<=x;i++){
			boolean b=checkperf(i);
			if(b)
		    System.out.print(i+"  ");
			
			}
				System.out.println(" is a perfect no");
			    System.out.println("\nJava Version: "+System.getProperty("java.version"));
			    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
			    System.out.println("Java Home: "+System.getProperty("java.home"));
			    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
			    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
			    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

		}		
		public static boolean checkperf(int x) {
		int	sum=0;
	     for(int i=1;i<=x/2;i++){
	    	 if(x%i==0){
	    		 sum=sum+i;
	    	 }
	     }return sum==x;	    	 

		}

	}
