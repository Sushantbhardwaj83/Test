import java.util.Scanner;
public class Count {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the value");
        int count = 0;
        int n=sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                count = count + 1;
                System.out.println(i);// display the even value
            }
        }
        System.out.println("count:" + count);        
}}