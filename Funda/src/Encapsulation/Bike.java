package Encapsulation;

public class Bike {
	int id,price,installment;
	String name,engine,color;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getInstallment() {
		return installment;
	}
	public void setInstallment(int installment) {
		this.installment=installment;
	}
	public String getEngine()
	{
		return engine;
	}
	public void setEngine(String engine) {
		this.engine=engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
void discount(){
	if(installment==1)
	{ price=price-20*price/100;
		System.out.println("Disconted price is"+price);
	}
	else if(installment==2) {
		price=price-10*price/100;
		System.out.println("Discounted price is:"+price);
	}
	else if(installment==3) {
		price=price-5*price/100;
		System.out.println("Discounted price is:"+price);
	}
}
}
