package NewPac;

public class Theater {
	
	
	int SeatNo;
	char Sec;
	String Class;
	String Parking;
	
	void Entry()
	{
		
		System.out.println("Parking Ticket"+" "+Parking);
		System.out.println("I am seating on"+" "+Sec+SeatNo+" "+"At section of"+" "+ Class);
	}
	
	
	void SetData(int SNo,char Sc,String Cls)
	{
		SeatNo=SNo;
		Sec=Sc;
		Class=Cls;
		
	}

	Theater(String pt)
	{
	Parking = pt;
	}
	
	Theater()
	{
		String Tht = "Entered";
		System.out.println("Enterence"+" "+Tht);
	}

	public static void main(String[] args) {
		
         Theater cs = new Theater();
		 Theater Cus = new Theater("Paid");
		 Theater Cus1 = new Theater("Paid");
		 Theater Cus2 = new Theater("Paid");
		 Cus.SetData(8, 'A',"FC");
		 Cus1.SetData(9, 'A',"FC");
		 Cus2.SetData(10, 'A',"FC");
		 
		 Cus.Entry();
		 Cus1.Entry();
		 Cus2.Entry();
		 
	}

}
