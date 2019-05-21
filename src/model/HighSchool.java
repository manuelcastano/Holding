package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for a high school company
*/
public class HighSchool extends Education{
	
	private int nationalPosition11;
	
	/**
	*HighSchool constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param type the type of the company
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param registry the registry
	*@param accreditedYears the number of year accredited
	*@param rectorName the name of the rector
	*@param studentsStratum the number of students in stratum 1 and 2	
	*@param students the number of students
	*@param nationalPosition11 the position in the saber11 test
	*/
	public HighSchool(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int nationalPosition11){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution, registry, accreditedYears, rectorName, studentsStratum, students);
		this.nationalPosition11 = nationalPosition11;
	}
	
	/**
	*Gets the position in the saber11 test
	*@return the position in the saber11 test
	*/
	public int getNationalPosition11(){
		return nationalPosition11;
	}
	
	/**
	*Sets the national position in the saber11 test
	*@param nationalPosition11 the national position in the saber11 test
	*/
	public void setNationalPosition11(int nationalPosition11){
		this.nationalPosition11 = nationalPosition11;
	}
}