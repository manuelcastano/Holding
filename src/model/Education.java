package model;

/**
*@author Manuel David Casta�o Saldarriaga
*This class contains the information for a education company
*/
public abstract class Education extends Service{
	
	private String registry;
	private int accreditedYears;
	private String rectorName;
	private int studentsStratum;
	private int students;
	
	/**
	*Education constructor
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
	*/
	public Education(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution, String registry, int accreditedYears, String rectorName, int studentsStratum, int students){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution);
		this.registry = registry;
		this.accreditedYears = accreditedYears;
		this.rectorName = rectorName;
		this.studentsStratum = studentsStratum;
		this.students = students;
	}
	
	/**
	*Gets the registry
	*@return the registry
	*/
	public String getRegistry(){
		return registry;
	}
	
	/**
	*Sets the registry
	*@param registry the registry
	*/
	public void setRegistry(String registry){
		this.registry = registry;
	}
	
	/**
	*Gets the accredited years
	*@return the accredited year
	*/
	public int getAccreditedYears(){
		return accreditedYears;
	}
	
	/**
	*Sets the accredited year
	*@param accreditedYears the accredited years
	*/
	public void setAccreditedYear(int accreditedYears){
		this.accreditedYears = accreditedYears;
	}
	
	/**
	*Gets the rector name
	*@return the rector name
	*/
	public String getRectorName(){
		return rectorName;
	}
	
	/**
	*Sets the rector name
	*@param rectorName the name of the rector
	*/
	public void setRectorName(String rectorName){
		this.rectorName = rectorName;
	}
	
	/**
	*Gets the number of students in stratum 1 and 2
	*@return the number of students in stratum 1 and 2
	*/
	public int getStudentsStratum(){
		return studentsStratum;
	}
	
	/**
	*Sets the number of students in stratum 1 and 2
	*@param studentsStratum the number of students in stratum 1 and 2
	*/
	public void setStudentsStratum(int studentsStratum){
		this.studentsStratum = studentsStratum;
	}
	
	/**
	*Gets the number of students 
	*@return the number of students 
	*/
	public int getStudents(){
		return students;
	}
	
	/**
	*Sets the number of students 
	*@param studentsStratum the number of students
	*/
	public void setStudentsStratum(int students){
		this.students = students;
	}
}