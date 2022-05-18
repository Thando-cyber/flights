package Flight;

public class Aircraft {
	private String Make;
	private String Model;
	private int Capp;
	public Aircraft() {
		Make = Model = "";
		Capp = 0;
	}
	public Aircraft(String Make,String Model,int Cap) {
		this.Capp = Cap;
		this.Make = Make;
		this.Model = Model;
		
	}
	public int getCapp () {
		return Capp;
	}
	public String Make() {
		return Make;
	}
	public String Model() {
		return Model;
	}
	public void setCapp(int Capp) {
		this.Capp= Capp;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}
	public void setMake(String Make) {
		this.Make = Make;
	}
	public String toString() {
		return "Make:"+Make+",Model:"+Model+",Capacity"+Capp;
	}
		
}
