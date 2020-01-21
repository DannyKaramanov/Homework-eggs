package Eggs;

import java.util.Scanner;


public class TestEggs {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Kolko qica jelaete da svarite? ");
		
		if (NumberOfEggs.getNumOfEggs() > 0 && NumberOfEggs.getNumOfEggs() <=3) {
			System.out.println("Slojete gi v " + TypeOfContainer.typeContainer[0]);
		}
			else if (NumberOfEggs.getNumOfEggs() >=4 && NumberOfEggs.getNumOfEggs() <= 6) {
			System.out.println("Slojete gi v " + TypeOfContainer.typeContainer[1]);
			}
			else if (NumberOfEggs.getNumOfEggs() >6 ) {
			System.out.println("Slojete gi v " + TypeOfContainer.typeContainer[2]);
		
		}
		else {
			System.out.println("Vuvedete polojitelno chislo!");
		}
		
		System.out.println("Sipete voda kolkoto da pokriete qicata");
		System.out.println("Kakvi iskate da budat qicata?");
		
		
		int select;
		for (select = 0; select < TypeOfEgg.sortEgtype().length ; select++) {
			System.out.println((select + 1) + ". " + TypeOfEgg.sortEgtype()[select]);
		}
		
		select = sc.nextInt();
		
		
		while (select <=1 || select >3){

			System.out.println("Molq izberete chislo ot 1 do 3");
			select = sc.nextInt();
		}
		if (select == 1) {
			System.out.println("Izchakaite dokato vodata zapochne da vri i gi slojete da se varqt za 3 minuti");
		}else if (select == 2) {
			System.out.println("Izchakaite dokato vodata zapochne da vri i gi slojete da se varqt za 6 minuti");
		}else if (select == 3) {
			System.out.println("Izchakaite dokato vodata zapochne da vri i gi slojete da se varqt za 10 minuti");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
