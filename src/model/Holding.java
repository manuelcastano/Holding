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
	*@param rows the rows of the building
	*/
	public Holding(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, int rows){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, rows);
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
	*add a subordinate company<br>
	*pre: subordinates must be initialized
	*@param newCompany the company to add
	*/
	public void addSubordinate(Company newCompany){
		subordinates.add(newCompany);
	}
	
	/**
	*to show the whole information<br>
	*pre: subordinates must be initialized
	*@return the information of the holding
	*/
	public String wholeInformation(){
		String msg = toString();
		for(int i = 0; i < subordinates.size(); i++){
			msg += "********************************\n";
			msg += subordinates.get(i).toString();
			msg += "********************************\n";
		}
		return msg;
	}
	
	/**
	*to return all the service companies<br>
	*pre: subordinates must be initialized
	*@return the service companies
	*/
	public String serviceCompanys(){
		String msg = "";
		for(int i = 0; i < subordinates.size(); i++){
			if(subordinates.get(i) instanceof Service){
				msg += "\n"+i+". "+subordinates.get(i).getNameRegistered();
			}
		}
		return msg;
	}
	
	/**
	*To add a poll<br>
	*pre: subordinates must be initialized
	*@param position the position of the company in the list
	*@param toAdd the poll to add
	*@return a message indicates if the poll could be added or not
	*/
	public String addPoll(int position, Poll toAdd){
		Service toAddThePoll = (Service)subordinates.get(position);
		return toAddThePoll.addPoll(toAdd);
	}
	
	/**
	*to return all companies in a list<br>
	*pre: subordinates must be initialized
	*@return a message with all companies
	*/
	public String companies(){
		String msg = "-1. The Holding";
		for(int i = 0; i < subordinates.size(); i++){
			msg += "\n"+i+". "+subordinates.get(i).getNameRegistered();
		}
		return msg;
	}
	
	/**
	*to add a employee<br>
	*pre: subordinates must be initialized
	*@param position the position in the list
	*@param toAdd the employee to add
	*@return a message indicates if the employee could be added
	*/
	public String addEmployee(int position, Employee toAdd){
		String msg = "";
		if(position == -1){
			msg = addEmployee(toAdd);
		}
		else{
			msg = subordinates.get(position).addEmployee(toAdd);
		}
		return msg;
	}
	
	/**
	*to return the extension of the employee
	*pre: subordinates must be initialized
	*@param position the position of the company in the list
	*@param nameEmployee the name of the employee
	*@param travel the way to find the extension
	*@return the extension of the employee
	*/
	public String extensionEmployee(int position, String nameEmployee, char travel){
		String msg = "The employee doesn't exist";
		if(position == -1){
			if(travel == 'L'){
				msg = travelInL(nameEmployee);
			}
			else if(travel == 'Z'){
				msg = travelInZ(nameEmployee);
			}
			else if(travel == 'X'){
				msg = travelInX(nameEmployee);
			}
			else if(travel == 'O'){
				msg = travelInO(nameEmployee);
			}
			else if(travel == 'R'){
				msg = travelInSpiralRow(nameEmployee);
			}
		}
		else{
			if(travel == 'L'){
				msg = subordinates.get(position).travelInL(nameEmployee);
			}
			else if(travel == 'Z'){
				msg = subordinates.get(position).travelInZ(nameEmployee);
			}
			else if(travel == 'X'){
				msg = subordinates.get(position).travelInX(nameEmployee);
			}
			else if(travel == 'O'){
				msg = subordinates.get(position).travelInO(nameEmployee);
			}
			else if(travel == 'R'){
				msg = subordinates.get(position).travelInSpiralRow(nameEmployee);
			}
		}
		return msg;
	}
	
	/**
	*to return all the mails os employees that are occupied a position
	*@param selected the position in the list of the company
	*@param position the position in search
	*@return the mails of the employees that are occupied a position
	*/
	public String mailsPosition(int selected, String position){
		String msg = "";
		if(selected == -1){
			msg = spiralColumn(position);
		}
		else{
			msg = subordinates.get(selected).spiralColumn(position);
		}
		return msg;
	}
	
	/**
	*to return all the fabrication companies<br>
	*pre: subordinates must be initialized
	*@return the fabrication companies
	*/
	public String fabricationCompanies(){
		String msg = "";
		for(int i = 0; i < subordinates.size(); i++){
			if(subordinates.get(i) instanceof Fabrication){
				msg += "\n"+i+". "+subordinates.get(i).getNameRegistered();
			}
		}
		return msg;
	}
	
	/**
	*to add a product
	*pre: subordinates must be initialized
	*@param selected the position of the company in the list
	*@param toAdd the new product
	*/
	public void addProduct(int selected, Product toAdd){
		Fabrication theCompany = (Fabrication)subordinates.get(selected);
		theCompany.addProduct(toAdd);
	}
}