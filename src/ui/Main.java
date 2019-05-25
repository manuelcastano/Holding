package ui;
import model.*;
import java.util.Scanner;

/**
*@author Manuel David Castaño Saldarriaga
*This class is for the interaction with the user
*/
public class Main{
	
	private Holding theHolding;
	private Scanner reader;
	
	/**
	*Main constructor
	*/
	public Main(){
		reader = new Scanner(System.in);
	}
	
	public static void main(String[] args){
		Main m = new Main();
	}
}