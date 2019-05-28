package ui;
import model.*;
import java.util.Scanner;

/**
*@author Manuel David Castaño Saldarriaga
*This class is for the interaction with the user
*/
public class Main{
	
	private Holding theHolding;
	private Scanner reader;
	
	/**
	*Main constructor
	*/
	public Main(){
		reader = new Scanner(System.in);
	}
	
	/**
	*The main method
	*@param args the Strings that the user can pass at the moment of open the program
	*/
	public static void main(String[] args){
		Main m = new Main();
		m.getInfoHolding();
		m.showMenu();
	}
	
	/**
	*to get the whole information necessary to initialize the program
	*/
	public void getInfoHolding(){
		System.out.println("Information of the holding:");
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		theHolding = new Holding(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution);
	}
	
	/**
	*To show a menu for the user
	*/
	public void showMenu(){
		System.out.println("************Welcome to the holding program************");
		int option = -1;
		while(option != 0){
			System.out.println("************Please, select an option************");
			System.out.println("0. To exit of the program");
			System.out.println("1. To add a public service company");
			System.out.println("2. To add an university company");
			System.out.println("3. To add a high school company");
			System.out.println("4. To add a technological company");
			System.out.println("5. To add a food company");
			System.out.println("6. To add a medicine company");
			option = reader.nextInt();
			reader.nextLine();
			switch(option){
				case 0:
				break;
				case 1:
				publicService();
				break;
				case 2:
				university();
				break;
				case 3:
				highSchool();
				break;
				case 4:
				technological();
				break;
				case 5:
				food();
				break;
				case 6:
				medicine();
				break;
				default:
				System.out.println("Select a correct option");
				break;
			}
		}
	}
	
	/**
	*to add a public service company
	*/
	public void publicService(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Type service:");
		System.out.println("1. sewerage");
		System.out.println("2. energy");
		System.out.println("3. aqueduct");
		int typeService = reader.nextInt();
		reader.nextLine();
		System.out.println("Subscribers:");
		int subscribers = reader.nextInt();
		reader.nextLine();
		System.out.println("Subscribers in stratum 1 and 2");
		int subscribersStratum = reader.nextInt();
		reader.nextLine();
		PublicService toAdd = new PublicService(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, typeService, subscribers, subscribersStratum);
		theHolding.addSubordinate(toAdd);
	}
	
	/**
	*to add an university company
	*/
	public void university(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Registry:");
		String registry = reader.nextLine();
		System.out.println("Number of years accredited:");
		int accreditedYears = reader.nextInt();
		reader.nextLine();
		System.out.println("Rector name:");
		String rectorName = reader.nextLine();
		System.out.println("Number of students in stratum 1 and 2:");
		int studentsStratum = reader.nextInt();
		reader.nextLine();
		System.out.println("Number of students:");
		int students = reader.nextInt();
		reader.nextLine();
		System.out.println("Position in the saberPro test:");
		int nationalPositionPro = reader.nextInt();
		reader.nextLine();
		University toAdd = new University(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, registry, accreditedYears, rectorName, studentsStratum, students, nationalPositionPro);
		theHolding.addSubordinate(toAdd);
	}
	
	/**
	*to add a high school company
	*/
	public void highSchool(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Registry:");
		String registry = reader.nextLine();
		System.out.println("Number of years accredited:");
		int accreditedYears = reader.nextInt();
		reader.nextLine();
		System.out.println("Rector name:");
		String rectorName = reader.nextLine();
		System.out.println("Number of students in stratum 1 and 2:");
		int studentsStratum = reader.nextInt();
		reader.nextLine();
		System.out.println("Number of students:");
		int students = reader.nextInt();
		reader.nextLine();
		System.out.println("Position in the saber11 test:");
		int nationalPosition11 = reader.nextInt();
		reader.nextLine();
		HighSchool toAdd = new HighSchool(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, registry, accreditedYears, rectorName, studentsStratum, students, nationalPosition11);
		theHolding.addSubordinate(toAdd);
	}
	
	/**
	*to add a technological company
	*/
	public void technological(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Kilowatts:");
		int energy = reader.nextInt();
		reader.nextLine();
		Technological toAdd = new Technological(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, energy);
		theHolding.addSubordinate(toAdd);
	}
	
	/**
	*to add a food company
	*/
	public void food(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Group of the food:");
		int group = reader.nextInt();
		reader.nextLine();
		Food toAdd = new Food(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, group);
		theHolding.addSubordinate(toAdd);
	}
	
	/**
	*to add a medicine company
	*/
	public void medicine(){
		System.out.println("Name:");
		String nameRegistered = reader.nextLine();
		System.out.println("Nit:");
		String nit = reader.nextLine();
		System.out.println("Address:");
		String address = reader.nextLine();
		System.out.println("Contact number:");
		String contactNumber = reader.nextLine();
		System.out.println("Number of employees:");
		int employees = reader.nextInt();
		reader.nextLine();
		System.out.println("Value of the actives:");
		double value = reader.nextDouble();
		reader.nextLine();
		System.out.println("Legal representative:");
		String legalRepresentative = reader.nextLine();
		System.out.println("Constitution date:");
		System.out.println("Day:");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int year = reader.nextInt();
		reader.nextLine();
		Date constitution = new Date(day, month, year);
		System.out.println("Type:");
		String type = reader.nextLine();
		System.out.println("Sanitary registration:");
		String sanitaryRegistration = reader.nextLine();
		System.out.println("Status:");
		System.out.println("1. valid");
		System.out.println("2. not renewed");
		int theStatus = reader.nextInt();
		reader.nextLine();
		boolean status = false;
		if(theStatus == 1){
			status = true;
		}
		System.out.println("Modality:");
		String modality = reader.nextLine();
		System.out.println("Expiration date:");
		System.out.println("Day:");
		int expirationDay = reader.nextInt();
		reader.nextLine();
		System.out.println("Month:");
		int expirationMonth = reader.nextInt();
		reader.nextLine();
		System.out.println("Year:");
		int expirationYear = reader.nextInt();
		reader.nextLine();
		Date expiration = new Date(expirationDay, expirationMonth, expirationYear);
		Medicine toAdd = new Medicine(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type, sanitaryRegistration, status, modality, expiration);
		theHolding.addSubordinate(toAdd);
	}
}