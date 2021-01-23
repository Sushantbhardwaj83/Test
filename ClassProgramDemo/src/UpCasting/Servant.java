package UpCasting;

import java.util.Random;
public class Servant {

	Vegetable bringAndGive()
	{
		Random r=new Random();
		int rn=r.nextInt(3);
		if(rn==0)
		{
			Carrot c=new Carrot();
			return c;
		}
		else if(rn==1)
		{
			Chilly ch=new Chilly();
			return ch;
		}
		else {
			Potato p=new Potato();
			return p;
		}
	}
}
