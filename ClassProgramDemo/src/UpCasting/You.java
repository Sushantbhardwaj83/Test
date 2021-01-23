package UpCasting;


public class You {
void preparefood()
{
	Servant s=new Servant();
	Vegetable v=s.bringAndGive();
	v.washed();
	v.vegetablecut();
	if(v instanceof Carrot)
	{
		Carrot c=(Carrot)v;
		c.prepareHalwa();
	}
	else if(v instanceof Chilly)
	{
		Chilly ch=(Chilly)v;
		ch.prepareBajji();
	}
	else{
		Potato p=(Potato)v;
		p.preparechips();
	}
}
	public static void main(String[] args) {
You y=new You();
y.preparefood();
System.out.println("food served");
	}

}
