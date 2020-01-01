package java_core_lesson13.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Deputat> listDeputat=new ArrayList<Deputat>();
		listDeputat.add(new Deputat("Kravchuk","Leonid",true,70,170));
		listDeputat.add(new Deputat("Krav","Irina",false,60,160));
		VerkhovnaRada.getInstance().addFaction("Sluga",listDeputat);
		listDeputat.add(new Deputat("Krivcov","Igor",true,70,170));
		listDeputat.add(new Deputat("Krav","Irina",false,60,160));
		VerkhovnaRada.getInstance().addFaction("Sluga",listDeputat);
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			int item = sc.nextInt();
			switch (item) {
			case 1: {
				System.out.println("Input name of the faction");
				String namefaction = sc.next();
				VerkhovnaRada.getInstance().addFaction(namefaction);
				break;
			}
			case 2: {
				System.out.println("Input name of faction for removing: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().removeFaction(nameFaction);
				break;
			}
			case 3: {
				VerkhovnaRada.getInstance().outputAllFaction();
				break;
			}
			case 4: {
				System.out.println("Input name of faction for clear: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().clearFaction(nameFaction);
				break;
			}
			case 5: {
				System.out.println("Input name of faction: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().outputAllDeputatOfFaction(nameFaction);
				break;
			}
			case 6: {
				System.out.println("Input name of faction ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().addDeputatOfFaction(nameFaction);
				break;
			}
			case 7: {
				System.out.println("Input name of faction: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().removeDeputataOfFaction(nameFaction);
				break;
			}
			case 8: {
				System.out.println("Input name of faction: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().outputAllHabarnikOfFaction(nameFaction);
				break;
			}
			case 9: {
				System.out.println("Input name of faction: ");
				String nameFaction = sc.next();
				VerkhovnaRada.getInstance().outputLargestHabarnikOfFaction(nameFaction);
				break;
			}
			default:
				System.exit(0);
				break;
			}
		}
	}

	static void menu() {
		System.out.println("For exist press any key.\n" + "1. Add Faction.\n" + "2. Remove Faction.\n"
				+ "3. Output all factions. \n" + "4. Clear faction.\n" + "5. Output deputaty of faction.\n"
				+ "6. Add deputat in faction.\n" + "7. Remove deputat from faction.\n" + "8. Output list habarnikiv.\n"
				+ "9. Largest habarnik.\n");
	}
}
