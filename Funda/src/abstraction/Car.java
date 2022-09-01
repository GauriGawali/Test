package abstraction;

abstract public class Car {
	
	int price;
	String color;
	 
	Car(){
		color="color";
		price=0000;
		}
	void wheels() {
		System.out.println("4 wheels");
	}
	void Stearing() {
		System.out.println("one stearing");
	}
abstract public void engine();
abstract public void dashboard();
abstract public void fuelType();
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

}
