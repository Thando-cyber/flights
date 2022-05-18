package Flight;
import java.util.*;

public class FlyTester {
	public static Aircraft airfly(Scanner in) {
		Aircraft obj;
		System.out.print("Aircraft Make: ");String make = in.next();
		System.out.print("Aircraft Model: ");String model = in.next();
		System.out.print("Aircraft Capacity: ");int capp = in.nextInt();
		obj = new Aircraft(make, model ,capp);
		return obj;
	}
	public static inDirectFlight getIndirectFlight(Scanner in) {
		inDirectFlight obj;
		System.out.println("Enter flight details");
		System.out.print("Flight No:");String flyname = in.next();
		System.out.print("Destination: ");String dest = in.next();
		System.out.print("Depart time: ");String time = in.next();
		System.out.print("Flight Cost: ");double flycost = in.nextDouble();
		Aircraft air = airfly(in);
		System.out.print("Departure Gate: ");String dep = in.next();
		System.out.print("Profit Rate : "); double profitRate = in.nextDouble();
		System.out.print("Tranfer Airport: ");String trans = in.next();
		System.out.print("Levy: ");double levy = in.nextDouble();
		System.out.print("Transit allowed(True/False): "); boolean Extra= in.nextBoolean();
		obj = new inDirectFlight(flyname, dest,time,flycost ,air, dep,profitRate,trans ,levy ,Extra);
		return obj;
		
	}
	public static DirectFlight getdirectFlight(Scanner in) {
		DirectFlight obj;
		System.out.println("Enter flight details");
		System.out.print("Flight No:");String flyname = in.next();
		System.out.print("Destination: ");String dest = in.next();
		System.out.print("Depart time: ");String time = in.next();
		System.out.print("Flight Cost: ");double flycost = in.nextDouble();
		Aircraft air = airfly(in);
		System.out.print("Departure Gate: ");String dep = in.next();
		System.out.print("Profit Rate : "); double profitRate = in.nextDouble();
		obj = new DirectFlight(flyname, dest,time,flycost ,air, dep,profitRate);
		return obj;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Is the flight Direct or in-Direct(D/I): "); char de = scan.next().charAt(0);
		if (de == 'D') {
			getdirectFlight(scan);
		}else if (de == 'I') {
			getIndirectFlight(scan);
		}
	}
}
