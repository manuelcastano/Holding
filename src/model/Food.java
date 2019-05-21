package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for food companys
*/
public class Food extends Fabrication{
	
	/**
	*Food constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param type the type of the company
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param sanitaryRegistration the sanitary registration
	*@param status the status of the invima
	*@param modality the modality of the company
	@param expiration the expiration date
	*/
	public Food(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution, String sanitaryRegistration, boolean status, String modality, Date expiration){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution, sanitaryRegistration, status, modality, expiration);
	}
}