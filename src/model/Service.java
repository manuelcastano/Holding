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
	*@param rows the rows of the building
	*@param type the type of the company
	*/
	public Service(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, int rows, String type){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, rows, type);
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
	
	/**
	*to return the information of the company
	*@return the information of the company
	*/
	public String toString(){
		String msg = super.toString();
		msg += "the average of the level of satisfaction is "+averageIndicator()+"\n";
		return msg;
	}
	
	/**
	*to add a poll<br>
	*pre: polls must be initialized
	*@param toAdd the poll to add
	*@return a message indicates if the poll could be added or not
	*/
	public String addPoll(Poll toAdd){
		String msg = "";
		boolean added = false;
		for(int i = 0; !added && i < polls.length; i++){
			if(polls[i] == null){
				polls[i] = toAdd;
				added = true;
			}
		}
		if(!added){
			msg = "the poll couldn't be added";
		}
		else{
			msg = "the poll were added succesfuly";
		}
		return msg;
	}
	
	/**
	*to return an average indicator of the level of satisfaction of their clients
	*@return the average of the level of satisfaction
	*/
	public double averageIndicator(){
		double average = 0.0;
		int pollsRealized = 0;
		for(int i = 0; i < polls.length; i++){
			if(polls[i] != null){
				average += polls[i].averageIndicator();
				pollsRealized++;
			}
		}
		return average/pollsRealized;
	}
}