package model;
import java.util.ArrayList;

/**
*@author Manuel David Castaño Saldarriaga
*This is the main class in the model, contains the information of the holding
*/
public class Holding extends LegalPersonality{
	
	private ArrayList<Company> subordinates;
	
	/**
	*Holding constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*/
	public Holding(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution);
		subordinates = new ArrayList<Company>();
	}
	
	/**
	*Gets the subordinate companys
	*@return an arraylist of companys
	*/
	public ArrayList<Company> getSubordinates(){
		return subordinates;
	}
	
	/**
	*Sets the subordinate companys
	*@param subordinates an arraylist of companys
	*/
	public void setSubordinates(ArrayList<Company> subordinates){
		this.subordinates = subordinates;
	}
	
	/**
	*add a subordinate company
	*@param newCompany the company to add
	*/
	public void addSubordinate(Company newCompany){
		subordinates.add(newCompany);
	}
}