package inheritanceWithGetterSetter;

public class Mobile {
int id,price;
String name;
Battery b;
public void setId(int id)
{
	this.id=id;
	}

public int getId() {
	return id;
}

public void setName(String name)
{
	this.name=name;
	}
public String getName() {
	return name;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
	}
public void setB(Battery b) {
	this.b=b;
}
public Battery getB() {
	return b;
}
}
