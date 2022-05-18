package Flight;
	
	
public abstract class FlyCustomer 
{
	private String FlightNo;
	private String Dest;
	private String DepartTime;
	protected double flightCost;
	private Aircraft airline;
	private String DepartureGate;
	protected double profitRate;
	public FlyCustomer(){
		FlightNo = DepartTime = "";
		Dest = DepartureGate = " ";
		profitRate = flightCost = 0.0;
		
	}
	public FlyCustomer(String FlightNo,String Dest,String DepartTime,double flightCost,Aircraft airline,String DepartureGate, double profitRate)
	{
		this.FlightNo = FlightNo;
		this.Dest = Dest;
		this.DepartTime = DepartTime;
		this.airline = airline;
		this.DepartureGate = DepartureGate;
		this.flightCost = flightCost;
		this.profitRate = profitRate;
	}
	public void SetFlightNo(String FlightNo) {
		this.FlightNo = FlightNo;
	}
	public void Setprofit(double profit) {
		this.profitRate = profit;
	}
	public void SetDest(String Dest) {
		this.Dest = Dest;
	}
	public void SetDepart(String Depart) {
		this.DepartTime = Depart;
	}
	public void SetFairline(Aircraft airline) {
		this.airline = airline;
	}
	public void SetflightCost(double flightCost) {
		this.flightCost = flightCost;
	}
	public void SetDepartGate(String DGate) {
		this.DepartureGate= DGate;
	}
	public String getFliNu() {
		return FlightNo;
	}
	public String getDest() {
		return Dest;
	}
	public String getDepartTime() {
		return DepartTime;
	}
	public double getProfitRate() {
		return profitRate;
	}
	public String  getGate() {
		return DepartureGate;
	}
	public double  getFlightCost() {
		return flightCost;
	}
	public Aircraft getAirline() {
		return airline;
	}
	public String toString() {
		return 	 FlightNo+","+ Dest+","+ DepartTime+","+flightCost+ ","+airline+","+DepartureGate+","+profitRate;
	
	}
	
}
