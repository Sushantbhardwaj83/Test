public class Passanger {
	String name;
	Ticket givesTicket()
	{
		Ticket t=new Ticket();
		System.out.println("passanger shown ticket");
		return t;
	}
	void takesFood()
	{
		AirHostage ah=new AirHostage();
		System.out.println("airhostage provides food");
	}
}
