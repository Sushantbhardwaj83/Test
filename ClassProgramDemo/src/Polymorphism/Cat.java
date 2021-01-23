package Polymorphism;
public class Cat  extends Animal{

	void sound()
	{
		System.out.println("meuw");
	}
	public static void main(String[] args) {

		Animal a=new Cat();
		a.sound();
		Horse h=new Horse();
		h.sound();
		Animal an=new Animal();
		an.sound();
	}

}
