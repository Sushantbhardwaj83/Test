
public class Person {
	String name="Guldu";
	void purchase(){
		Shop s=new Shop();
		Product p=s.sell(20);
		System.out.println("person purchase products");
	}
}
