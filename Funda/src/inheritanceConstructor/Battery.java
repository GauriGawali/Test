package inheritanceConstructor;

public class Battery {
	
	int id;
	String name,capacity;
	Battery(int id,String name,String capacity){
		this.id=id;
		this.name=name;
		this.capacity=capacity;
	}
	
	public String toString() {
		return "\nBattery name is:="+name+"\nBattery Capacity is:="+capacity;
	}

}
