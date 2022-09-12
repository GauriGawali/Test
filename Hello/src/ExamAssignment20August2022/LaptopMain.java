package ExamAssignment20August2022;

public class LaptopMain {

	public static void main(String[] args) {
	Laptop l=new Laptop();
	l.setNoOfUSBPort(4);
	l.setProcessorSpeed(120);

	System.out.println("USB Port is:"+l.getNoOfUSBPort()+"\nProcessor Speed is:"+l.getprocessorSpeed());
	}

}
