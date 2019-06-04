package model;

public abstract class LegalPersonality{
	
	private String nameRegistered;
	private String nit;
	private String address;
	private String contactNumber;
	private int employees;
	private double value;
	private String legalRepresentative;
	private Date constitution;
	private Building[][] theTower;
	
	/**
	*LegalPersonality constructor
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
	public LegalPersonality(String nameRegistered, String nit, String address, String contactNumber, int employees, double value, String legalRepresentative, Date constitution, int rows){
		this.nameRegistered = nameRegistered;
		this.nit = nit;
		this.address = address;
		this.contactNumber = contactNumber;
		this.employees = employees;
		this.value = value;
		this.legalRepresentative = legalRepresentative;
		this.constitution = constitution;
		theTower = new Building[rows][20];
		setTheExtensions();
	}
	
	/**
	*Gets the name registered
	*@return the name registered
	*/
	public String getNameRegistered(){
		return nameRegistered;
	}
	
	/**
	*Sets the name registered
	*@param nameRegistered the name registered
	*/
	public void setNameRegistered(String nameRegistered){
		this.nameRegistered = nameRegistered;
	}
	
	/**
	*Gets the nit
	*@return the nit
	*/
	public String getNit(){
		return nit;
	}
	
	/**
	*Sets the nit
	*@param nit the nit
	*/
	public void setNit(String nit){
		this.nit = nit;
	}
	
	/**
	*Gets the address
	*@return the address
	*/
	public String getAddress(){
		return address;
	}
	
	/**
	*Sets the address
	*@param address the address
	*/
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	*Gets the contact number
	*@return the contact number
	*/
	public String getContactNumber(){
		return contactNumber;
	}
	
	/**
	*Sets the contact number
	*@param contactNumber the contact number
	*/
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	
	/**
	*Gets the number of employees
	*@return the number of employees
	*/
	public int getEmployees(){
		return employees;
	}
	
	/**
	*Sets the number of employees
	*@param employees the number
	*/
	public void setEmployees(int employees){
		this.employees = employees;
	}
	
	/**
	*Gets the value
	*@return the value
	*/
	public double getValue(){
		return value;
	}
	
	/**
	*Sets the value
	*@param value the value
	*/
	public void setEmployees(double value){
		this.value = value;
	}
	
	/**
	*Gets the legal representative
	*@return the legal representative
	*/
	public String getLegalRepresentative(){
		return legalRepresentative;
	}
	
	/**
	*Sets the legal representative
	*@param legalRepresentative the legal representative
	*/
	public void setLegalRepresentative(String legalRepresentative){
		this.legalRepresentative = legalRepresentative;
	}
	
	/**
	*Gets the constitution date
	*@return the constitution date
	*/
	public Date getConstitution(){
		return constitution;
	}
	
	/**
	*Sets the constitution date
	*@param constitution the constitution date
	*/
	public void setConstitution(Date constitution){
		this.constitution = constitution;
	}
	
	/**
	*Gets the tower
	*@return the tower
	*/
	public Building[][] getTheTower(){
		return theTower;
	}
	
	/**
	*Sets the tower
	*@param theTower the tower
	*/
	public void setTheTower(Building[][] theTower){
		this.theTower = theTower;
	}
	
	/**
	*To find all the mails of employees that are occupied a position, in spiral by column<br>
	*pre: theTower is initialized
	*@param position the position of the employees
	*@return all the mails of employees that are occupied a position
	*/
	public String spiralColumn(String position){
		String mails = "";
		int rowUp = 0;
		int rowDown = theTower.length-1;
		int columnLeft = 0;
		int columnRight = theTower[0].length-1;
		for(int p = 0; p < theTower.length*theTower[0].length;){
			for(int i = rowUp; i <= rowDown; i++){
				if(theTower[i][columnLeft].positionEmployee(position)){
					mails += theTower[i][columnLeft].mailEmployee()+"\n";
				}
				p++;
			}
			columnLeft++;
			for(int i = columnLeft; i <= columnRight; i++){
				if(theTower[rowDown][i].positionEmployee(position)){
					mails += theTower[rowDown][i].mailEmployee()+"\n";
				}
				p++;
			}
			rowDown--;
			for(int i = rowDown; i >= rowUp; i--){
				if(theTower[i][columnRight].positionEmployee(position)){
					mails += theTower[i][columnRight].mailEmployee()+"\n";
				}
				p++;
			}
			columnRight--;
			for(int i = columnRight; i >= columnLeft; i--){
				if(theTower[rowUp][i].positionEmployee(position)){
					mails += theTower[rowUp][i].mailEmployee()+"\n";
				}
				p++;
			}
			rowUp++;
		}
		return mails;
	}
	
	/**
	*to find the extension of a employee with his name in L<br>
	*pre: theTower must be initialized
	*@param name the name of the employee
	*@return the extension of the employee
	*/
	public String travelInL(String name){
		String msg = "The employee doesn't exist";
		boolean finded = false;
		for(int i = 0; !finded && i < theTower.length; i++){
			if(theTower[i][0].nameEmployee().equals(name)){
				msg = theTower[i][0].getExtension();
				finded = true;
			}
		}
		for(int i = 1; !finded && i < theTower[0].length; i++){
				if(theTower[0][i].nameEmployee().equals(name)){
				    msg = theTower[0][i].getExtension();
				    finded = true;
			    }
			}
		return msg;
	}
	
	/**
	*to find the extension of a employee with his name in Z<br>
	*pre: theTower must be initialized
	*@param name the name of the employee
	*@return the extension of the employee
	*/
	public String travelInZ(String name){
		String msg = "The employee doesn't exist";
		boolean finded = false;
		for(int i = 0; !finded && i < theTower[0].length; i++){
			if(theTower[0][i].nameEmployee().equals(name)){
				msg = theTower[0][i].getExtension();
				finded = true;
			}
		}
		for(int i = 0; !finded && i < theTower[0].length; i++){
			if(theTower[theTower.length-1][i].nameEmployee().equals(name)){
				msg = theTower[theTower.length-1][i].getExtension();
				finded = true;
			}
		}
		for(int i = 0; !finded && i < theTower.length;){
			for(int j = theTower[0].length-1; !finded && j >= 0;){
				if(theTower[i][j].nameEmployee().equals(name)){
				    msg = theTower[i][j].getExtension();
				    finded = true;
			    }
				if(!finded){
				    j--;
					i++;
				}
			}
		}
		return msg;
	}
	
	/**
	*to find the extension of a employee with his name in X<br>
	*pre: theTower must be initialized
	*@param name the name of the employee
	*@return the extension of the employee
	*/
	public String travelInX(String name){
		String msg = "The employee doesn't exist";
		boolean finded = false;
		for(int i = 0; !finded && i < theTower.length; i++){
			for(int j = 0; !finded && j < theTower[0].length; j++){
				if(i == j && theTower[i][j].nameEmployee().equals(name)){
					msg = theTower[i][j].getExtension();
					finded = true;
				}
			}
		}
		for(int i = 0; !finded && i < theTower.length;){
			for(int j = theTower[0].length-1; !finded && j >= 0;){
				if(theTower[i][j].nameEmployee().equals(name)){
				    msg = theTower[i][j].getExtension();
				    finded = true;
			    }
				if(!finded){
				    j--;
					i++;
				}
			}
		}
		return msg;
	}
	
	/**
	*to find the extension of a employee with his name in O<br>
	*pre: theTower must be initialized
	*@param name the name of the employee
	*@return the extension of the employee
	*/
	public String travelInO(String name){
		String msg = "The employee doesn't exist";
		boolean finded = false;
		int rowDown = theTower.length-1;
		int columnLeft = 0;
		int columnRight = theTower[0].length-1;
		for(int i = 0; !finded && i <= rowDown; i++){
			if(theTower[i][columnLeft].nameEmployee().equals(name)){
				msg = theTower[i][columnLeft].getExtension();
				finded = true;
			}
		}
		columnLeft++;
		for(int i = columnLeft; !finded && i <= columnRight; i++){
			if(theTower[rowDown][i].nameEmployee().equals(name)){
				msg = theTower[rowDown][i].getExtension();
				finded = true;
			}
		}
		rowDown--;
		for(int i = rowDown; !finded && i >= 0; i--){
			if(theTower[i][columnRight].nameEmployee().equals(name)){
				msg = theTower[i][columnRight].getExtension();
				finded = true;
			}
		}
		columnRight--;
		for(int i = columnRight; !finded && i >= columnLeft; i--){
			if(theTower[0][i].nameEmployee().equals(name)){
				msg = theTower[0][i].getExtension();
				finded = true;
			}
		}
		return msg;
	}
	
	/**
	*to find the extension of a employee with his name in spiral by row<br>
	*pre: theTower must be initialized
	*@param name the name of the employee
	*@return the extension of the employee
	*/
	public String travelInSpiralRow(String name){
		String msg = "";
		if(theTower.length % 2 == 0){
			msg = "This tour can not be done because the number of floors is even ";
		}
		else{
			msg = "The employee doesn't exist";
			boolean finded = false;
			boolean last = false;
			for(int i = 0; !finded && i < theTower.length; i++){
				if(!last){
					for(int j = 0; !finded && j < theTower[0].length; j++){
						if(theTower[i][j].nameEmployee().equals(name)){
							msg = theTower[i][j].getExtension();
							finded = true;
						}
					}
					last = true;
				}
				else{
					for(int j = theTower[0].length-1; !finded && j >= 0; j--){
						if(theTower[i][j].nameEmployee().equals(name)){
							msg = theTower[i][j].getExtension();
							finded = true;
						}
					}
					last = false;
				}
			}
		}
		return msg;
	}
	
	/**
	*to return the information of the company
	*@return the information of the holding
	*/
	public String toString(){
		String msg = "The name of the company is "+nameRegistered+"\n";
		msg += "The nit of the company is "+nit+"\n";
		msg += "The address of the company is "+address+"\n";
		msg += "The contact number of the company is "+contactNumber+"\n";
		msg += "The number of employees is "+employees+"\n";
		msg += "The value of the actives is "+value+"\n";
		msg += "The legal representative is "+legalRepresentative+"\n";
		msg += "The constitution date is "+constitution.getDay()+"/"+constitution.getMonth()+"/"+constitution.getYear()+"\n";
		return msg;
	}
	
	/**
	*to add a new employee to the company
	*@param toAdd the new employee
	*@return a message indicates if the employee could be added
	*/
	public String addEmployee(Employee toAdd){
		String msg = "The employee couldn't be added";
		boolean added = false;
		for(int i = 0; !added && i < theTower.length; i++){
			for(int j = 0; !added && j < theTower[0].length; j++){
				if(theTower[i][j].getTheEmployee() == null){
					theTower[i][j].setTheEmployee(toAdd);
					added = true;
					msg = "the employee were added successfuly";
				}
			}
		}
		return msg;
	}
	
	/**
	*to set the extension of each cublice with a random number<br>
	*pre: theTower must be initialized
	*/
	public void setTheExtensions(){
		for(int i = 0; i < theTower.length; i++){
			for(int j = 0; j < theTower[0].length; j++){
				theTower[i][j] = new Building(""+(int) ((Math.random() * 215487878) + 1), null);
			}
		}
	}
}