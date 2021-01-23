public class TestLaptop {

	public static void main(String[] args) {
Laptop l=new Laptop();
l.model="hp";
System.out.println("hp laptop");
l.switchoff();
l.playgame();
l.switchoff();
System.out.println("-----------");
Laptop l1=new Laptop();
l1.model="dell";
System.out.println("dell laptop");
l1.switchon();
l1.playgame();
l1.switchoff();
	}

	
}
