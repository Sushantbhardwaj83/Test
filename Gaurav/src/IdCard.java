
public class IdCard {
	String name;
	String website="www.jspiders.com";
	long mob;
			
	public static void main(String[] args) {

		IdCard i = new IdCard();
		i.name="Mantu";
		i.mob=9041835365l;
		System.out.println(i.name);
		System.out.println(i.mob);
		System.out.println(i.website);
		System.out.println("---------------");
		
		IdCard i1 = new IdCard();
		i1.name="Gagan";
		i1.mob=9041119610l;
		System.out.println(i1.name);
		System.out.println(i1.mob);
		System.out.println(i1.website);
		System.out.println(i1);
		
		
	}

}
