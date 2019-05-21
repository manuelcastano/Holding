package model;
import java.util.ArrayList;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for a fabrication company
*/
public abstract class Fabrication extends Company{
	
	private String sanitaryRegistration;
	private boolean status;
	private String modality;
	
	private ArrayList<Product> products;
	
	/**
	*Fabrication constructor
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
	*/
	public Fabrication(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution, String sanitaryRegistration, boolean status, String modality){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution);
		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.modality = modality;
		products = new ArrayList<Product>();
	}
}