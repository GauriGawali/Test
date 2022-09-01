package inheritanceConstructor;

public class Car {
String cName,color;
Driver d;
 Car(String cName,String color){
	 this.cName=cName;
	 this.color=color;
	 this.d=new Driver(1,"Ram",25000);
 }
 public String toString() {
	 return "Car name is"+cName+"\nCar color is"+color+"\nDriver detalis is:"+d;
 }

}
