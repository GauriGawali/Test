package Encapsulation;

public class Pulsarr {

	public static void main(String[] args) {
	
	Bike b=new Bike();
	b.setId(1);
	b.setName("Pulsar");
	b.setColor("Black");
	b.setEngine("220cc");
	b.setPrice(100000);
	b.setInstallment(2);
	
	System.out.println("Id : "+b.getId()+"\nName: "+b.getName()+ "\nColour : " +b.getColor()+"\nEngine : "+b.getEngine()+"\nPrice : " +b.getPrice() + "\nInstallment :"+ b.getInstallment());
b.discount();
	}
}
