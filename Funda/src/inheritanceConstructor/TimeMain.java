package inheritanceConstructor;

public class TimeMain {

	public static void main(String[] args) {
		/*Time t=new Time();
		t.setDate(10, 40, 20);
		t.setTime(10,5,6);
		t.display();
*/
		Day d=new Day();
		d.setDay("Tuesday");
		d.setDate(10, 40, 20);
		d.setTime(10,5,6);
		d.display();
	}

}
