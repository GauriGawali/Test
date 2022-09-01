package inheritanceConstructor;

public class MobileBatteryMain {

	public static void main(String[] args) {
		Battery b=new Battery(1,"Lithium","5W");
		Battery b1=new Battery(2,"Livguard", "L700");
		Battery b2=new Battery(3,"Nokia BV-T4B", "3000mAh");
		Battery b3=new Battery(4,"Intex", "2000mAh");
		Battery b4=new Battery(5,"Micromax E313", "2500mAh");
		
		Mobile m=new Mobile(1,"Vivo",25000,b);
		Mobile m1=new Mobile(2,"Samsung",27000,b);
		Mobile m2=new Mobile(3,"Nokia",2000,b);
		Mobile m3=new Mobile(4,"Intex",15000,b);
		Mobile m4=new Mobile(5,"Micromax",35000,b);
		System.out.println(m);
		System.out.println("_____________________________________");
		
		System.out.println(m1);
		System.out.println("_____________________________________");
		
		
		System.out.println(m2);
		System.out.println("_____________________________________");
		
		
		System.out.println(m3);
		System.out.println("_____________________________________");
		
		
		System.out.println(m4);
		System.out.println("_____________________________________");
		

	}

}
