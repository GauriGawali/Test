package inheritanceWithGetterSetter;

public class TimeDate {

	public static void main(String[] args) {
		/*Time t=new Time();
		t.setHrs(10);
		t.setMin(25);
		t.setSec(04);
		t.setDd(16);
		t.setMm(8);
		t.setYy(2022);
		
System.out.println("Time is "+t.getHrs()+"/"+t.getMin()+"/"+t.getMin());

System.out.println("Date is "+t.getDd()+":"+t.getMm()+":"+t.getYy());
	*/
		
		Day d=new Day();
		d.setDay("TuesDay");
		d.setHrs(10);
		d.setMin(25);
		d.setSec(04);
		d.setDd(16);
		d.setMm(8);
		d.setYy(2022);
		System.out.println("Day is:"+d.getDay());
		
System.out.println("Time is "+d.getHrs()+"/"+d.getMin()+"/"+d.getSec());

System.out.println("Date is "+d.getDd()+":"+d.getMm()+":"+d.getYy());
	}

}
