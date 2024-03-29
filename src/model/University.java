package model;

/**
**@author Manuel David Casta�o Saldarriaga
*This class contains the information for the university companys
*/
public class University extends Education{
	
	private int nationalPositionPro;
	
	/**
	*University constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param type the type of the company
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param rows the rows of the building
	*@param registry the registry
	*@param accreditedYears the number of year accredited
	*@param rectorName the name of the rector
	*@param studentsStratum the number of students in stratum 1 and 2	
	*@param students the number of students
	*@param nationalPositionPro the position in the pro test
	*/
	public University(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, int rows, String type, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int nationalPositionPro){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, rows, type, registry, accreditedYears, rectorName, studentsStratum, students);
		this.nationalPositionPro = nationalPositionPro;
	}
	
	/**
	*Gets the position in the pro test
	*@return the position in the pro test
	*/
	public int getNationalPositionPro(){
		return nationalPositionPro;
	}
	
	/**
	*Sets the national position in the pro test
	*@param nationalPositionPro the national position in the pro test
	*/
	public void setNationalPositionPro(int nationalPositionPro){
		this.nationalPositionPro = nationalPositionPro;
	}
	
	/**
	*to return the information
	*@return the information
	*/
	public String toString(){
		String msg = super.toString();
		msg += "The national position in the saber pro test is "+nationalPositionPro+"\n";
		return msg;
	}
}