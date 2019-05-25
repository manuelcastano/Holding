package model;

public class LegalPersonality{
	
	private String nameRegistered;
	private String nit;
	private String address;
	private String contactNumber;
	private int employees;
	private double value;
	private String legalRepresentative;
	private Date constitution;
	
	/**
	*LegalPersonality constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*/
	public LegalPersonality(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution){
		this.nameRegistered = nameRegistered;
		this.nit = nit;
		this.address = address;
		this.contactNumber = contactNumber;
		this.employees = employees;
		this.value = value;
		this.legalRepresentative = legalRepresentative;
		this.constitution = constitution;
	}
	
	/**
	*Gets the name registered
	*@return the name registered
	*/
	public String getNameRegistered(){
		return nameRegistered;
	}
	
	/**
	*Sets the name registered
	*@param nameRegistered the name registered
	*/
	public void setNameRegistered(String nameRegistered){
		this.nameRegistered = nameRegistered;
	}
	
	/**
	*Gets the nit
	*@return the nit
	*/
	public String getNit(){
		return nit;
	}
	
	/**
	*Sets the nit
	*@param nit the nit
	*/
	public void setNit(String nit){
		this.nit = nit;
	}
	
	/**
	*Gets the address
	*@return the address
	*/
	public String getAddress(){
		return address;
	}
	
	/**
	*Sets the address
	*@param address the address
	*/
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	*Gets the contact number
	*@return the contact number
	*/
	public String getContactNumber(){
		return contactNumber;
	}
	
	/**
	*Sets the contact number
	*@param contactNumber the contact number
	*/
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	
	/**
	*Gets the number of employees
	*@return the number of employees
	*/
	public int getEmployees(){
		return employees;
	}
	
	/**
	*Sets the number of employees
	*@param employees the number
	*/
	public void setEmployees(int employees){
		this.employees = employees;
	}
	
	/**
	*Gets the value
	*@return the value
	*/
	public double getValue(){
		return value;
	}
	
	/**
	*Sets the value
	*@param value the value
	*/
	public void setEmployees(double value){
		this.value = value;
	}
	
	/**
	*Gets the legal representative
	*@return the legal representative
	*/
	public String getLegalRepresentative(){
		return legalRepresentative;
	}
	
	/**
	*Sets the legal representative
	*@param legalRepresentative the legal representative
	*/
	public void setLegalRepresentative(String legalRepresentative){
		this.legalRepresentative = legalRepresentative;
	}
	
	/**
	*Gets the constitution date
	*@return the constitution date
	*/
	public Date getConstitution(){
		return constitution;
	}
	
	/**
	*Sets the constitution date
	*@param constitution the constitution date
	*/
	public void setConstitution(Date constitution){
		this.constitution = constitution;
	}
}