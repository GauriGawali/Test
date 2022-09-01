package inheritance;

public class CarDriverMain {
	
	public static void main(String[] args) {
	/*
	Driver d=new Driver(1,"Ram","9890586321");
	Driver d1=new Driver(2,"Sham","8745632102");
	Driver d2=new Driver(3,"Kumar","8545632100");
	
	
	
	Car c=new Car(1,"Swift","7585",d);
	Car c1=new Car(21,"Aura","9515",d1);
	Car c2=new Car(16,"Nexon","8855",d2);*/
	
  /*.out.println(c);
   System.out.println();
   System.out.println(c1);
   System.out.println();
   System.out.println(c2);*/
		Driver d=new Driver();
		d.setId(1);
		d.setName("neha");
		d.setContact("9874563210");
		
		
	//	System.out.println(d.id+" "+d.name+" "+d.contact);
		
		
		Car c=new Car();
		c.setId(1);
		c.setName("Swift");
		c.setCnumber("9874");
		c.setD(d);
		System.out.println("\nCar ID is :="+c.id+"\ncar name is:= "+c.name+"\ncar number is:= "+c.cnumber+"\nDriver id is:= "+d.id+"\nDriver name is:= "+d.name+"\nDriver contact no is:= "+d.contact);
}
}