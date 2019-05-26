package model;

/**
*to manage the information of a employee
*/
public class Employee{
	
	private String name;
	private String position;
	private String mail;
	
	/**
	*Employee constructor
	*@param name the name
	*@param position the position
	*@param mail the mail
	*/
	public Employee(String name, String position, String mail){
		this.name = name;
		this.position = position;
		this.mail = mail;
	}
	
	/**
	*Gets the name
	*@return the name
	*/
	public String getName(){
		return name;
	}
	
	/**
	*Sets the name
	*@param name the name
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	*Gets the position
	*@return the position
	*/
	public String getPosition(){
		return position;
	}
	
	/**
	*Sets the position
	*@param position the position
	*/
	public void setPosition(String position){
		this.position = position;
	}
	
	/**
	*Gets the mail
	*@return the mail
	*/
	public String getMail(){
		return mail;
	}
	
	/**
	*Sets the mail
	*@param mail the mail
	*/
	public void setMail(String mail){
		this.mail = mail;
	}
}