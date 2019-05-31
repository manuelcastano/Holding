package model;

/**
*to manage the information for the building of a company
*/
public class Building{
	
	private String extension;
	private Employee theEmployee;
	
	/**
	*Building constructor
	*@param extension the extension of the cubicle
	*@param theEmployee the employee in the cubicle
	*/
	public Building(String extension, Employee theEmployee){
		this.extension = extension;
		this.theEmployee = theEmployee;
	}
	
	/**
	*Gets the extension
	*@return the extension
	*/
	public String getExtension(){
		return extension;
	}
	
	/**
	*Sets the extension
	*@param extension the extension
	*/
	public void setExtension(String extension){
		this.extension = extension;
	}
	
	/**
	*Gets the employee
	*@return the employee
	*/
	public Employee getTheEmployee(){
		return theEmployee;
	}
	
	/**
	*Sets the employee
	*@param theEmployee the employee
	*/
	public void setTheEmployee(Employee theEmployee){
		this.theEmployee = theEmployee;
	}
	
	/**
	*to return if the employee in the cubicle is working in a position
	*@param position the position of the employee
	*@return a boolean indicates if the employee is occupied that position
	*/
	public boolean positionEmployee(String position){
		boolean occupiesThePosition = false;
		if(theEmployee != null && theEmployee.getPosition().equals(position)){
			occupiesThePosition = true;
		}
		return occupiesThePosition;
	}
	
	/**
	*to return the mail of the employee<br>
	*@return the mail
	*/
	public String mailEmployee(){
		return theEmployee.getMail();
	}
}