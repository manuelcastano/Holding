package model;
import java.util.ArrayList;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for a technological company
*/
public class Technological extends Service implements Trees{
	
	public static final char CONSULTANCY = 'C';
	public static final char TRAINING = 'T';
	public static final char DEVELOPMENT = 'D';
	public static final char INFRASTRUCTURE = 'I';
	public static final char SOFTWARE = 'S';
	public static final char PLATFORM = 'P';
	
	private int energy;
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
	*@param rows the rows of the building
	*@param type the type of the company
	*@param energy the energy consumed by the company
	*/
	public Technological(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, int rows, String type, int energy){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, rows, type);
		this.energy = energy;
		services = new ArrayList<Character>();
	}
	
	/**
	*To get the energy
	*@return the energy
	*/
	public int getEnergy(){
		return energy;
	}
	
	/**
	*To set the energy	
	*@param energy the energy
	*/
	public void setEnergy(int energy){
		this.energy = energy;
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
	
	/**
	*to return the trees that a company has to plant
	*@return the quantity of trees to plant
	*/
	public int treesToPlant(){
		int trees = 0;
		if(energy >= 1 && energy <= 1000){
			trees = 8;
		}
		else if(energy >= 1001 && energy <= 3000){
			trees = 35;
		}
		else if(energy > 3000){
			trees = 500;
		}
		return trees;
	}
}