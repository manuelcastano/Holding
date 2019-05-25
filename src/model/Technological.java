package model;
import java.util.ArrayList;

/**
*@author Manuel David Casta�o Saldarriaga
*This class contains the information for a technological company
*/
public class Technological extends Service{
	
	public static final char CONSULTANCY = 'C';
	public static final char TRAINING = 'T';
	public static final char DEVELOPMENT = 'D';
	public static final char INFRASTRUCTURE = 'I';
	public static final char SOFTWARE = 'S';
	public static final char PLATFORM = 'P';
	
	private ArrayList<Character> services;
	
	/**
	*Technological constructor
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
	public Technological(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		services = new ArrayList<Character>();
	}
	
	/**
	*Gets the services
	*@return the services
	*/
	public ArrayList<Character> getServices(){
		return services;
	}
	
	/**
	*Sets the services
	*@param services the services
	*/
	public void setServices(ArrayList<Character> services){
		this.services = services;
	}
	
	/**
	*add a service
	*@param service the new service
	*/
	public void addService(char service){
		services.add(service);
	}
}