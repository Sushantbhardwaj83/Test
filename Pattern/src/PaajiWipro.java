import java.util.Scanner;

public class PaajiWipro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(i+2);

			}System.out.println();
		}
		for (int i = n; i >0; i--) {
			for (int j = 1; j <= i; j++){
				System.out.print(i+2);
			}System.out.println();
		}
		System.out.println();
	}
}