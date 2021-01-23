import java.util.Scanner;

public class DecToOctal {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the decimal no");
			int n=sc.nextInt();
			String rs=decToOctal(n);
			System.out.println(rs);
				}
				static String decToOctal(int n)
				{
					String bin=" ";
					while(n!=0)
					{
						int r=n%8;
						bin=r+bin;
						n=n/8;
					}
					return bin;
				}

			}
