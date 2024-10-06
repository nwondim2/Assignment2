/*
 * Class: CMSC203 
 * Instructor:
 * Description: Program reads user input and displays patient information.
 * Due: 10/04/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nahom Wondimu
*/


import java.util.Scanner;

public class PatientDriverApp {

	public static void main(String[] args) {
		String studentName = "Nahom Wondimu";
		int mcNum = 21164783;
		String dueDate = "10/06/2024";
		
			/** Forming the Patient */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gathering Information\n\n");
		
		// Name
		System.out.print("Firstname: ");
		String firstName = sc.nextLine();
		System.out.print("Middlename: ");
		String middleName = sc.nextLine();
		System.out.print("Lastname: ");
		String lastName = sc.nextLine();
		
		
		System.out.print("Phone Number: ");
		String number = sc.nextLine();
		// Number
		while(number.length() != 10) {
			System.out.print("Invalid Number.\nInput Number: ");
			number = sc.nextLine();
		}
		
		// Address
		String street = "", city = "", state = "", zip = "";
		
		System.out.print("Street: ");
		street = sc.nextLine();
		if(street.equals("")) {
			street = "No Address Given";
		}else {
			System.out.print("City: ");
			city = sc.nextLine();
			System.out.print("State: ");
			state = sc.nextLine();
			System.out.print("Zip: ");
			zip = sc.nextLine();
		}
		
		// Emergency Info
		String emgName = "",emgNum = "";
		System.out.print("Emergency Contact Name: ");
		emgName = sc.nextLine();
		if(emgName.equals("")) {
			emgName = "No Emergency Contact Given";
		}else {
			System.out.print("Emergency Contact Number: ");
			emgNum = sc.nextLine();

			// Number
			while(emgNum.length() != 10) {
				System.out.print("Invalid Number.\nInput Number: ");
				emgNum = sc.nextLine();
			}
		}
		
		
		
		Patient person = new Patient(firstName, middleName, lastName, number, street, city, state, zip, emgName, emgNum);
		
		// Forming the Procedures
		String pdName1 = "Blood Test", pdDate1 = "7/20/2019", pdPracter1 = "Dr. Irvine";
		double pdCharges1 = 3250.0;
		
		String pdName2 = "X-ray", pdDate2 = "12/03/2020", pdPracter2 = "Dr. Jamison";
		double pdCharges2 = 5500.43;
		
		String pdName3 = "Physical Exam", pdDate3 = "07/23/2020", pdPracter3 = "Dr. Smith";
		double pdCharges3 = 1400.75;
		
		Procedure p1 = new Procedure();
		p1.setPdName(pdName1);
		p1.setPdDate(pdDate1);
		p1.setPdPracter(pdPracter1);
		p1.setPdcharges(pdCharges1);
		
		Procedure p2 = new Procedure(pdName2, pdDate2);
		p2.setPdPracter(pdPracter2);
		p2.setPdcharges(pdCharges2);
		
		Procedure p3 = new Procedure(pdName3, pdDate3, pdPracter3, pdCharges3);
		System.out.println("\n3 Procedures have been Added.\n\n");
		
		
		// Displaying Info
		displayPatient(person);
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
		System.out.println("Total Charges: $" + calculateTotalCharges(p1, p2, p3) + "\n");
		
		System.out.println("Student Name: " + studentName);
		System.out.println("MD #: M" + mcNum);
		System.out.println("Due Date: " + dueDate);
		
		sc.close();
	}
	
	public static void displayPatient(Patient person) {
		System.out.println(person.toString());
		System.out.println("");
	}
	
	public static void displayProcedure(Procedure proced) {
		System.out.println(proced.toString());
		System.out.println("");
	}
	
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		double sum = p1.getPdCharges() + p2.getPdCharges() + p3.getPdCharges();
		return sum;
	}

}
