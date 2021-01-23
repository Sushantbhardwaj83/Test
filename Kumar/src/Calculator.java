
public class Calculator {
void add(Integer i,double d)
{
	double res=(i+d);
	System.out.println(res);
}
void add(int i,Double d)
{
	double res=(i+d);
	System.out.println(res);
}
	public static void main(String[] args) {
Calculator c=new Calculator();
c.add(20, 50.3);
	}

}
