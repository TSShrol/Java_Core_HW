package java_core_lesson13.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class VerkhovnaRada {
	private static VerkhovnaRada instance;

	private VerkhovnaRada() {
	}

	public static VerkhovnaRada getInstance() {
		if (instance == null) {
			instance = new VerkhovnaRada();
		}
		return instance;
	}
	private ArrayList<Faction> rada = new ArrayList<>();
	
	public void addFaction(String nameFaction) {
		rada.add(new Faction(nameFaction));
	}

	void addFaction(String nameFaction, ArrayList<Deputat> listDeputat) {
		rada.add(new Faction(nameFaction, listDeputat));
	}

	public void removeFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			Iterator<Faction> iterator = rada.iterator();
			while (iterator.hasNext()) {
				Faction faction = iterator.next();
				if (faction.getNameFaction().equalsIgnoreCase(nameFaction)) {
					iterator.remove();
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	public void outputAllFaction() {
		System.out.println("All faction: ");
		for (Faction faction : rada) {
			System.out.println(faction);
		}
	}

	void addDeputatOfFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).addDeputat();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	void removeDeputataOfFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).removeDeputat();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	void outputAllHabarnikOfFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);
		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).outputAllHabarnik();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	void outputLargestHabarnikOfFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).largestHabarnik();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	void outputAllDeputatOfFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).outputAllDeputat();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	void clearFaction(String nameFaction) {
		boolean flag = isFaction(nameFaction);

		if (flag) {
			for (int i = 0; i < rada.size(); i++) {
				if (rada.get(i).getNameFaction().equalsIgnoreCase(nameFaction)) {
					rada.get(i).clearFaction();
					break;
				}
			}
		} else {
			System.out.println("Faction " + nameFaction + " is not exist in the rada");
		}
	}

	public boolean isFaction(String nameFaction) {
		for (Faction faction : rada) {
			if (faction.getNameFaction().equalsIgnoreCase(nameFaction)) {
				return true;
			}
		}
		return false;
	}

}
