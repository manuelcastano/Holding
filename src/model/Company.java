package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for the legal personality of a company
*/
public abstract class Company extends LegalPersonality{
	
	private String type;
	
	/**
	*Company constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param type the type of the company
	*/
	public Company(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution);
		this.type = type;
	}
	
	/**
	*Gets the type
	*@return the type
	*/
	public String getType(){
		return type;
	}
	
	/**
	*Sets the type
	*@param type the type
	*/
	public void setType(String type){
		this.type = type;
	}
}