package Flight;

public class inDirectFlight extends FlyCustomer {
	private String transAirport;
	private double levy;
	private boolean Extra;
	public inDirectFlight() {
		// TODO Auto-generated constructor stub
		super();
		transAirport = " ";
		levy = 0.0;
		Extra = false;
	}
	public inDirectFlight(String FlightNo,String Dest,String DepartTime,double flightCost,Aircraft airline,String DepartureGate, double profitRate,String transAirport,double levy, boolean Extra) 
	{
		super(FlightNo,Dest,DepartTime,flightCost,airline,DepartureGate,profitRate);
		this.Extra = Extra;
		this.levy = levy;
		this.transAirport = transAirport;
		
	}
	public void setTrans(String trans) {
		this.transAirport = trans;
	}
	public void setLevy(double levy) {
		this.levy = levy;
	}
	public void setEx(boolean Extra) {
		this.Extra = Extra;
	}
	public String getTran() {
		return transAirport;
	}
	public double getlevy() {
		return levy;
	}
	public boolean getEx() {
		return Extra;
	}
	public double FlightCost() {
		return (flightCost+profitRate)+levy;
	}
	public String toString() {
		return transAirport+","+levy+","+Extra;
	}
}
