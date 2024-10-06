
public class Procedure {
	private String pdName;
	private String pdDate;
	private String pdPracter;
	private double pdCharges;
	
	Procedure(){
		this.pdName = "";
		this.pdDate = "";
		this.pdPracter = "";
		this.pdCharges = 0.0;
	}
	
	Procedure(String pdName, String pdDate){
		this.pdName = pdName;
		this.pdDate = pdDate;
		this.pdPracter = "";
		this.pdCharges = 0.0;
	}
	
	Procedure(String pdName, String pdDate, String pdPracter, double pdCharges){
		this.pdName = pdName;
		this.pdDate = pdDate;
		this.pdPracter = pdPracter;
		this.pdCharges = pdCharges;
	}
	
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String getPdDate() {
		return pdDate;
	}
	public void setPdDate(String pdDate) {
		this.pdDate = pdDate;
	}
	public String getPdPracter() {
		return pdPracter;
	}
	public void setPdPracter(String pdPracter) {
		this.pdPracter = pdPracter;
	}
	public double getPdCharges() {
		return pdCharges;
	}
	public void setPdcharges(double pdcharges) {
		this.pdCharges = pdcharges;
	}
	
	public String toString() {
		String result = "";
		result += "\tProcedure: " + getPdName() + "\n";
		result += "\tProcedure Date: " + getPdDate() + "\n";
		result += "\tPractitioner: " + getPdPracter() + "\n";
		result += "\tCharge: " + getPdCharges() + "\n";
		return result;
	}
}
