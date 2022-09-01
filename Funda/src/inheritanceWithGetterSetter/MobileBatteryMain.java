package inheritanceWithGetterSetter;

public class MobileBatteryMain {

	public static void main(String[] args) {
		Battery b=new Battery();
		b.setId(1);
		b.setName("Lithium");
		b.setCapacity("5mA");
		
		
		b.setName("intex");
		b.setCapacity("500mA");
		
		
		b.setName("nokia");
		b.setCapacity("4000mA");
		
		
		b.setName("Ultra");
		b.setCapacity("2000mA");
		
		b.setName("HighSpeed");
		b.setCapacity("750mA");
		
		Mobile m=new Mobile();
		m.setId(1);
		m.setPrice(25000);
		m.setName("samsung");
		m.setB(b);
		
		Mobile m1=new Mobile();
		m1.setPrice(35000);
		m1.setName("nokia");
		m1.setB(b);
		Mobile m2=new Mobile();	
		
		m2.setPrice(50000);
		m2.setName("One+");
		m2.setB(b);
		Mobile m3=new Mobile();
		m3.setPrice(15000);
		m3.setName("Micromax");
		m3.setB(b);
		Mobile m4=new Mobile();
		m4.setPrice(20000);
		m4.setName("Vivo");
		m4.setB(b);
		System.out.println("1");
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.b.getname());
		System.out.println(m.b.getCapacity());
		System.out.println("_________________________________________________");
		
		System.out.println("2");
		System.out.println(m1.getName());
		System.out.println(m1.getPrice());
		System.out.println(m1.b.getname());
		System.out.println(m1.b.getCapacity());
		System.out.println("_________________________________________________");
		
		System.out.println("3");
		System.out.println(m2.getName());
		System.out.println(m2.getPrice());
		System.out.println(m2.b.getname());
		System.out.println(m2.b.getCapacity());
		System.out.println("_________________________________________________");
		
		System.out.println("4");
		System.out.println(m3.getName());
		System.out.println(m3.getPrice());
		System.out.println(m3.b.getname());
		System.out.println(m3.b.getCapacity());
		System.out.println("_________________________________________________");
		
		
		System.out.println("5");
		System.out.println(m4.getName());
		System.out.println(m4.getPrice());
		System.out.println(m4.b.getname());
		System.out.println(m4.b.getCapacity());



	}

}
