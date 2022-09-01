package abstraction;

public class CarMain {

	public static void main(String[] args) {
	/*Baleno b=new Baleno ();
		b.fuelType();
		b.dashboard();
		b.engine();
		b.setColor("white");
		b.setPrice(750000);
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
		b.wheels();
		b.Stearing();*/
		
		BalenoAlpha b=new BalenoAlpha ();
		b.fuelType();
		b.dashboard();
		b.engine();
		b.setColor("white");
		b.setPrice(750000);
		System.out.println("Baleno color:"+b.getColor());
		System.out.println("Baleno Price:"+b.getPrice());
		b.wheels();
		b.Stearing();

	}

}
