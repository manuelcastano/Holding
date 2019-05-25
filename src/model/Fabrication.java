package model;
import java.util.ArrayList;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for a fabrication company
*/
public abstract class Fabrication extends Company{
	
	private ArrayList<Product> products;
	
	/**
	*Fabrication constructor
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
	public Fabrication(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, String type){
		super(nameRegistered, nit, address, contactNumber, employees, value, legalRepresentative, constitution, type);
		products = new ArrayList<Product>();
	}
	
	/**
	*Gets the products
	*@return the products
	*/
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	/**
	*Sets the products
	*@param products the products
	*/
	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
	/**
	*to add a new product
	*@param newProduct the product to add
	*/
	public void addProduct(Product newProduct){
		products.add(newProduct);
	}
}