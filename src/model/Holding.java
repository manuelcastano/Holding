package model;
import java.util.ArrayList;

/**
*@author Manuel David Castaño Saldarriaga
*This is the main class in the model, contains the information of the holding
*/
public class Holding{
	
	private ArrayList<Company> subordinates;
	
	/**
	*Holding constructor
	*/
	public Holding(){
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