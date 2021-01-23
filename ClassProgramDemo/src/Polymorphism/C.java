package Polymorphism;
public class C extends P{

	void m2()
	{
		System.out.println("c-m2");
	}
	void m3()
	{
		System.out.println("c-m3");
	}
	public static void main(String[] args) {
P ref=new C();
ref.m1();
ref.m2();

C re=new C();
re.m1();
re.m2();
re.m3();
	}

}
