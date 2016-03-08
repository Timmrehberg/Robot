import java.util.Scanner;
public class Main extends Movement {

	public static void main(String[] args) {
		String Choice1;
		String Choice2;
		Robot robot1 = new Robot();
		Robot robot2 = new Robot ();
		robot2.battery = 100;
		robot1.battery = 100;
		Scanner scan = new Scanner (System.in);
		robot1.Takesteps();
		Choice1 = scan.nextLine();
		if (Choice1.equals("Yes")) {
			robot1.Batpercent();
			Choice1 = scan.nextLine();
		}
		else { System.out.println("Battery life is: " + battery);
				 

			 }

		
		
	
		}
	}
	
	

			 
		
	
	

		 

	
		
	
		 
	
	


