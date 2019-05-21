package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for the service companys
*/
public abstract class Service extends Company{
	
	/**
	*Service constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param type the type of the company
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*/
	public Service(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution);
	}
}