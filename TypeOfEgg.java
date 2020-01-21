package Eggs;

import java.util.Scanner;

public class TypeOfEgg {

	
	static String[] typeofegg = {"Rohki","Tvurdi","Rohki,no s tvurd beltuk"};
		

	public static String[] sortEgtype() {
	  return typeofegg;
	  
		}
	
	static Scanner eggType = new Scanner(System.in);
	static String type = eggType.toString();
}
