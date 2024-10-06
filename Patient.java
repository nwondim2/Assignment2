
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNum;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String emgName;
	private String emgPhone;
	
	Patient(){
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.phoneNum = "";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.emgName = "";
		this.emgPhone = "";
	}
	
	Patient(String first, String middle, String last){
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.phoneNum = "";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.emgName = "";
		this.emgPhone = "";
	}
	
	Patient(String first, String middle, String last, String phoneNum, String street, String city, String state, String zip, String emgName, String emgPhone){
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.phoneNum = phoneNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.emgName = emgName;
		this.emgPhone = emgPhone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmgName() {
		return emgName;
	}

	public void setEmgName(String emgName) {
		this.emgName = emgName;
	}

	public String getEmgPhone() {
		return emgPhone;
	}

	public void setEmgPhone(String emgPhone) {
		this.emgPhone = emgPhone;
	}
	
	public String buildFullName() {
		return (firstName + " " + middleName + " " + lastName);
	}
	
	public String buildAddress() {
		return (street + " " + city + " " + state + " " + zip);
	}
	
	public String buildEmergencyContact() {
		return (emgName + " " + emgPhone);
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Patient Info:\n";
		result += "  Name: " + buildFullName() + "\n";
		result += "  Address: " + buildAddress() + "\n";
		result += "  Emergency Contact: " + buildEmergencyContact() + "\n";
		return result;
	}
	
}
