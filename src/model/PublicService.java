package model;

/**
*To manage the information for a public service company
*/
public class PublicService extends Service implements ProCulture{
	
	public final static int SEWERAGE = 1;
	public final static int ENERGY = 2;
	public final static int AQUEDUCT = 3;  	
	
	private int typeService;
	private int subscribers;
	private int subscribersStratum;
	
	/**
	*PublicService constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*@param type the type of the company
	*@param typeService the type of the service
	*@param subscribers the quantity of subscribers
	*@param subscribersStratum the quantity of subscribers in stratum 1 and 2
	*/
	public PublicService(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type, int typeService, int subscribers, int subscribersStratum){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		this.typeService = typeService;
		this.subscribers = subscribers;
		this.subscribersStratum = subscribersStratum;
	}
	
	/**
	*Gets the type of the service
	*@return the type
	*/
	public int getTypeService(){
		return typeService;
	}
	
	/**
	*Sets the type of the service
	*@param typeService the type of the service
	*/
	public void setTypeService(int typeService){
		this.typeService = typeService;
	}
	
	/**
	*Gets the subscribers
	*@return the subscribers
	*/
	public int getSubscribers(){
		return subscribers;
	}
	
	/**
	*Sets the subscribers
	*@param subscribers the subscribers
	*/
	public void setSubscribers(int subscribers){
		this.subscribers = subscribers;
	}
	
	/**
	*Gets the subscribers in stratum 1 and 2
	*@return the subscribers in stratum 1 and 2
	*/
	public int getSubscribersStratum(){
		return subscribersStratum;
	}
	
	/**
	*Sets the subscribers in stratum 1 and 2
	*@param subscribersStratum the subscribers in stratum 1 and 2
	*/
	public void setSubscribersStratum(int subscribersStratum){
		this.subscribersStratum = subscribersStratum;
	}
	
	/**
	*to get the pro culture tax
	@return the money to pay
	*/
	public String tax(){
		double percentage = (subscribers - subscribersStratum)/subscribers;
		double percentagePro = 40 - percentage;
		String msg = "";
		if(percentagePro < 0){
			msg = "The company don't need to pay the tax";
		}
		else{
			msg = "The procultura percentage is "+(percentagePro*100);
		}
		return msg;
	}
}