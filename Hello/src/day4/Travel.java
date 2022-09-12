package day4;

public class Travel {

	
	public void doOnlineTicket(Bus b)
	{
		b.bookTicket();
	}
	public void doOnlineTicket(Train t)
	{
		t.bookTicket();
	}
	public void doOnlineTicket(Airplane a) {
		a.bookTicket(5);
	}
	public static void main(String[] args) {
	Travel T=new Travel();
	Bus b=new Bus();
	Train t=new Train();
	T.doOnlineTicket(b);
	T.doOnlineTicket(new Airplane());
    T.doOnlineTicket(t);
	}

}
