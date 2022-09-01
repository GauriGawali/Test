package inheritanceWithGetterSetter;

public class MarutiMain {

	public static void main(String[] args) {
	Swift s=new Swift();
	s.setColor("Red");
s.setEngine("5HP");
s.setGroundClear("160mm");
s.setModelNo("SwiftAlpha");
s.setName("Swift");
s.setPrice(950000);

System.out.println(s.getName()+"\ncolor:"+s.getColor()+"\nEngineCapacity:"+s.getEngine()+"\nmodelNo is:"+s.getModelNo()+"\nGround clear dist:"+s.groundClear+"\nPrice is:"+s.getPrice());
	
	Baleno b=new Baleno();
	b.setColor("Gray");
	b.setEngine("5HP");
	b.setModelNo("BalenoAlpha");
	b.setName("Baleno");
	b.setPrice(750000);

	System.out.println(b.getName()+"\ncolor:"+b.getColor()+"\nEngineCapacity:"+b.getEngine()+"\nmodelNo is:"+b.getModelNo()+"\nPrice is:"+s.getPrice());
	
	}

}
