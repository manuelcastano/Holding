package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for food companys
*/
public class Food extends Fabrication{
	
	private int group;
	
	/**
	*Food constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param type the type of the company
	*@param group the group of the food
	*/
	public Food(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type, int group){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		this.group = group;
	}
}