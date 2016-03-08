
public class Movement  {
	
	static int battery = 100;
		
	
public int takeSteps() {
	System.out.println(battery -= 25);
	System.out.println("Battery life is: ");
	return battery;

	}
public String Charging () {
	return "You have" + battery;
	
}
public void Recharge () {
	System.out.print(" Im running low on power ");
}
public String charging () {
	return ("Recharging now");
	
}
}
