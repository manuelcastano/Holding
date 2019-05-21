package mundo;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for a technological company
*/
public class Technological extends Service{
	
	public static final char CONSULTANCY = 'C';
	public static final char TRAINING = 'T';
	public static final char DEVELOPMENT = 'D';
	public static final char INFRASTRUCTURE = 'I';
	public static final char SOFTWARE = 'S';
	public static final char PLATFORM = 'P';
	
	private ArrayList<char> services;
	
	/**
	*Technological constructor
	*@param nameRegistered the name of the company
	*@param nit the nit of the company
	*@param address the address of the company
	*@param contactNumber the number of the company
	*@param employees the number of employees in the company
	*@param value the value of the actives
	*@param type the type of the company
	*@param legalRepresentative the name of the legal representative of the company
	*@param constitution the constitution date of the company
	*/
	public Technological(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String type, String legalRepresentative, Date constitution){
		super(nameRegistered, nit, address, contactNumber, employees, value, type, legalRepresentative, constitution);
		services = new ArrayList<char>();
	}
	
	/**
	*Gets the services
	*@return the services
	*/
	public ArrayList<char> getServices(){
		return services;
	}
	
	/**
	*Sets the services
	*@param services the services
	*/
	public void setServices(ArrayList<char> services){
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