package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for the service companys
*/
public abstract class Service extends Company{
	
	private Poll[] polls;
	
	/**
	*Service constructor
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
	public Service(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		polls = new Poll[50];
	}
	
	/**
	*Gets the polls
	*@return the polls
	*/
	public Poll[] getPolls(){
		return polls;
	}
	
	/**
	*Sets the polls
	*@param polls the polls
	*/
	public void setPolls(Poll[] polls){
		this.polls = polls;
	}
}