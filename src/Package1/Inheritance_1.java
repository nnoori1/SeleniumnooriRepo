package Package1;
// car classes starts
class car
{
	public void start ()
	{
		System.out.println("start the car");
	}
	
	public void stop ()
	{
		System.out.println("stop the car");
	
	}	
	
	
	
}


// car classes ended

//inheritance class porsche starts
class porsche extends car

{
	public void special_feature()
	{
		System.out.println("special_feature porsche");
	}
}	
	//inheritance class ends
	class ford extends porsche
	{
		public void special ()
		
	
		{
			System.out.println ("special_feature ford") ;
		}
		
	}	
	//inheritance class ford ends
		

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
porsche p=new porsche () ;
p.start();
p.stop ();
p.special_feature();
System.out.println("*********** up to  porsche*******");
ford f=new ford () ;
f.start () ;
f.stop () ;
f.special_feature () ;
f.special () ;
System.out.println("********** for ford*********");
	}
}