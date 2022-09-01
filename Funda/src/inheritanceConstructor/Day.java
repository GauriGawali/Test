package inheritanceConstructor;

public class Day extends Time {
String day;
void setDay(String day) {
	this.day=day;
}

void display() {
	  System.out.println("Day is:"+day+"\nDate"+dd+"/"+mm+"/"+yy+"\nTime is"+hrs+":"+min+":"+sec);
}
}
