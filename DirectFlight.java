package Flight;

public class DirectFlight extends FlyCustomer{

	public DirectFlight() {
		// TODO Auto-generated constructor stub
		super();
	}
	public DirectFlight(String FlightNo,String Dest,String DepartTime,double flightCost,Aircraft airline,String DepartureGate, double profitRate){
		// TODO Auto-generated constructor stub
		super(FlightNo,Dest,DepartTime,flightCost,airline,DepartureGate,profitRate);
		
	}
	public double FlightCost() {
		return flightCost+profitRate;
	}

}
