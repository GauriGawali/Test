package inheritanceConstructor;

public class Time extends Date {
int hrs,min,sec;
  void setDate(int hrs,int mm,int sec) {
	  this.hrs=hrs;
	  this.min=min;
	  this.sec=sec;
  }
  
  void display() {
	  System.out.println("Date"+dd+"/"+mm+"/"+yy+"TIme is"+hrs+":"+min+":"+sec);
  }
}
