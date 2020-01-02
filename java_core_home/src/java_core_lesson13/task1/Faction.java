package java_core_lesson13.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {
	String nameFaction;
	ArrayList<Deputat> listDeputatFaction;

	public Faction() {
		this.nameFaction=null;
		this.listDeputatFaction = new ArrayList<Deputat>();
	}
	public Faction(String nameFaction) {
		this.nameFaction=nameFaction;
		this.listDeputatFaction = new ArrayList<Deputat>();
	}
	public Faction(String nameFaction, ArrayList<Deputat> listDeputatFaction) {
		this.nameFaction=nameFaction;
		this.listDeputatFaction = listDeputatFaction;
	}

	public String getNameFaction() {
		return nameFaction;
	}
	public void setNameFaction(String nameFaction) {
		this.nameFaction = nameFaction;
	}
	public ArrayList<Deputat> getListDeputatFaction() {
		return listDeputatFaction;
	}
	public void setListDeputatFaction(ArrayList<Deputat> listDeputatFaction) {
		this.listDeputatFaction = listDeputatFaction;
	}
	
	
	@Override
	public String toString() {
		return "Faction [nameFaction=" + nameFaction + "]";
	}
	public void addDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of deputat for add: ");
		System.out.println("1. Input surname: ");
		String surname = sc.next();
		System.out.println("2. Input name: ");
		String name = sc.next();
		System.out.println("3. Input weight: ");
		int weight = sc.nextInt();
		System.out.println("4. Input height: ");
		int height = sc.nextInt();
		System.out.println("5. Input habarnik (true) or not habarnik (false): ");
		boolean habarnik = sc.nextBoolean();
		listDeputatFaction.add(new Deputat(surname, name, habarnik,weight, height));
		sc.close();
	}

	public void removeDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input surname of deputata for removing: ");
		String surname = sc.next();
		Iterator<Deputat> iterator = listDeputatFaction.iterator();
		while (iterator.hasNext()) {
			Deputat deputat = iterator.next();
			if (deputat.getSurname().equalsIgnoreCase(surname)) {
				iterator.remove();
			}
		}
		sc.close();
	}

	public void outputAllHabarnik() {
		boolean flag = false;
		for (Deputat deputat : listDeputatFaction) {
			if (deputat.isHabarnik()) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Deputaty habarniki: ");
			for (Deputat deputat : listDeputatFaction) {
				if (deputat.isHabarnik()) {
					System.out.println(deputat);
				}
			}
		} else {
			System.out.println("There are no habarni is the faction");
		}
	}

	public void largestHabarnik() {
		boolean flag = false;
		for (Deputat deputat : listDeputatFaction) {
			if (deputat.isHabarnik()) {
				flag = true;
			}
		}
		if (flag) {
			int maxHabar = 0;
			int indexHabarnik = 0;
			for (int i = 0; i < listDeputatFaction.size(); i++) {
				if (listDeputatFaction.get(i).isHabarnik()) {
					if (listDeputatFaction.get(i).getSizeOfHabar() > maxHabar) {
						maxHabar = listDeputatFaction.get(i).getSizeOfHabar();
						indexHabarnik = i;
					}
				}
			}
			System.out.println(listDeputatFaction.get(indexHabarnik).getSurname() + " " + listDeputatFaction.get(indexHabarnik).getName()
					+ " is largest habarnik");
		} else {
			System.out.println("There are no habarni is the faction");
		}
	}

	public void outputAllDeputat() {
		System.out.println("All deputaty of faction: ");
		for (Deputat deputat : listDeputatFaction) {
			System.out.println(deputat);
		}
	}

	public void clearFaction() {
		listDeputatFaction.clear();
	}
}
