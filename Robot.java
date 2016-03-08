import java.util.Scanner;

public class Robot extends Main {
String steps;
public int battery;
public int Batpercent() {
	String Choice1;
	Scanner scanner = new Scanner (System.in);
	System.out.println(battery -= 50);
	System.out.print("Battery life is: " + battery);
	if (battery < 55) {
		Robot robot3 = new Robot();
		robot3.Recharge();
		robot3.charging();
		
	}
	if (battery < 55) {
		Robot robot1 = new Robot ();
		System.out.println("Would you like to charge your device");
		robot1.Yesorno();
		Choice1 = scanner.nextLine();
		if (Choice1.equals("Yes")) {
			System.out.println("Charging now");
		}
		else {
			System.out.println("Not charging"); }
		}
		
		
		
	return battery;
}

public void Takesteps() {
	System.out.println("Should i take a step: Yes or no");
}
public void Yesorno() {
	System.out.println("Yes or no");
}
}

	



