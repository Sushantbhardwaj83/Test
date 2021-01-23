import java.util.Scanner;

public class CountLetter {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String st=s.nextLine();
	count(st);
}
public static void count(String st){
	char[] ch = st.toCharArray();
	int letter = 0;
	int space = 0;
	for(int i = 0; i < st.length(); i++){
		if(Character.isLetter(ch[i])){
			letter ++ ;
		}
		
		else if(Character.isSpaceChar(ch[i])){
			space ++ ;
		}		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
			}
}

		


