package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for medicine companys
*/
public class Medicine extends Fabrication implements Trees{
	
	private String sanitaryRegistration;
	private boolean status;
	private String modality;
	private Date expiration;
	
	/**
	*Medicine constructor
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
	*@param expiration the expiration date
	*/
	public Medicine(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type, String sanitaryRegistration, boolean status, String modality, Date expiration){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.modality = modality;
		this.expiration = expiration;
	}
	
	/**
	*Gets the sanitary registration
	*@return the sanitary registration
	*/
	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}
	
	/**
	*Sets the sanitary registration
	*@param sanitaryRegistration the sanitary registration
	*/
	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration = sanitaryRegistration;
	}
	
	/**
	*Gets the status
	*@return the status
	*/
	public boolean getStatus(){
		return status;
	}
	
	/**
	*Sets the status
	*@param status the status
	*/
	public void setStatus(boolean status){
		this.status = status;
	}
	
	/**
	*Gets the modality
	*@return the modality
	*/
	public String getModality(){
		return modality;
	}
	
	/**
	*Sets the modality
	*@param modality the modality
	*/
	public void setModality(String modality){
		this.modality = modality;
	}
	
	/**
	*Gets the expiration date
	*@return the expiration date
	*/
	public Date getExpiration(){
		return expiration;
	}
	
	/**
	*Sets the expiration date
	*@param expiration the expiration date
	*/
	public void setExpiration(Date expiration){
		this.expiration = expiration;
	}
	
	/**
	*to return the trees that a company has to plant
	*@return the quantity of trees to plant
	*/
	public int treesToPlant(){
		return 0;
	}
}