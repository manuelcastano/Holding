package model;

/**
*@author Manuel David Castaño Saldarriaga
*This class contains the information for the products
*/
public class Product{
	
	private String name;
	private String code;
	private double waterQuantity;
	private int inventory;
	
	/**
	*Product constructor
	*@param name the name of the product
	*@param code the code of the product
	*@param waterQuantity the water neccesary to do the product
	*@param inventory the inventory of the product
	*/
	public Product(String name, String code, double waterQuantity, int inventory){
		this.name = name;
		this.code = code;
		this.waterQuantity = waterQuantity;
		this.inventory = inventory;
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
	*Gets the code
	*@return the code
	*/
	public String getCode(){
		return code;
	}
	
	/**
	*Sets the code
	*@param code the code
	*/
	public void setCode(String code){
		this.code = code;
	}
	
	/**
	*Gets the water quantity
	*@return the water quantity
	*/
	public double getWaterQuantity(){
		return waterQuantity;
	}
	
	/**
	*Sets the water quantity
	*@param waterQuantity the water quantity
	*/
	public void setWaterQuantity(double waterQuantity){
		this.waterQuantity = waterQuantity;
	}
	
	/**
	*Gets the inventory
	*@return the inventory
	*/
	public int getInventory(){
		return inventory;
	}
	
	/**
	*Sets the inventory
	*@param inventory the inventory
	*/
	public void setInventory(int inventory){
		this.inventory = inventory;
	}
}