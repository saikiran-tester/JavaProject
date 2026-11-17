package NewPac;

public class IfElseCondition {

	public static void main(String[] args) {
		int MovieTicketCount = 0;
		
		if(MovieTicketCount == 1)
		{
			System.out.println("One Person can enter into Theater");
		}

		else if(MovieTicketCount == 2)
		{
			System.out.println("Two Person can enter into Theater");
		}
		
		else if(MovieTicketCount == 3)
		{
			System.out.println("Three Person can enter into Theater");
		}
		
		
		else if(MovieTicketCount == 4)
		{
			System.out.println("Four Person can enter into Theater");
		}
		
		else
		{
			System.out.println("No one allowed to enter theater");
		}
	}

}
