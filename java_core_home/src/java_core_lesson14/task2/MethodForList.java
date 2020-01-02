package java_core_lesson14.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class MethodForList {
	public void addCommodity(ArrayList<Commodity> listCommodity, Commodity commodity) {
		listCommodity.add(commodity);
	}

	public void removeCommodity(ArrayList<Commodity> listCommodity, String nameCommodity) {

		boolean flag = false;
		for (Commodity commodity : listCommodity) {
			if (commodity.getnameCommodity().equalsIgnoreCase(nameCommodity)) {
				flag = true;
			}
		}
		if (flag) {
			Iterator<Commodity> iterator = listCommodity.iterator();
			while (iterator.hasNext()) {
				Commodity commodity = iterator.next();
				if (commodity.getnameCommodity().equalsIgnoreCase(nameCommodity)) {
					iterator.remove();
				}
			}
		} else {
			System.out.println("Commodity " + nameCommodity + " is not exist in list");
		}
	}

	public void replaceCommodity(ArrayList<Commodity> listCommodity, String replaceNameCommodity, Commodity newCommodity) {

		boolean flag = false;
		for (Commodity commodity : listCommodity) {
			if (commodity.getnameCommodity().equalsIgnoreCase(replaceNameCommodity)) {
				flag = true;
			}
		}
		if (flag) {
			for (int i = 0; i < listCommodity.size(); i++) {

				if (listCommodity.get(i).getnameCommodity().equalsIgnoreCase(replaceNameCommodity)) {
					listCommodity.set(i, newCommodity);
				}
			}
		} else {
			System.out.println("Commodity " + replaceNameCommodity + " is not exist in list");
		}
	}

	public void sortByNameCommodity(ArrayList<Commodity> listCommodity) {
		listCommodity.sort(new CommodityComparator(CommodityEnum.NAMECOMMODITY));
	}

	public void sortByLength(ArrayList<Commodity> listCommodity) {
		listCommodity.sort(new CommodityComparator(CommodityEnum.LENGTH));
	}

	public void sortByWidth(ArrayList<Commodity> listCommodity) {
		listCommodity.sort(new CommodityComparator(CommodityEnum.WIDTH));
	}

	public void sortByWeight(ArrayList<Commodity> listCommodity) {
		listCommodity.sort(new CommodityComparator(CommodityEnum.WEIGHT));
	}
	public Commodity indexElement(ArrayList<Commodity> listCommodity,int index) throws IndexOutOfBoundsException{
		return listCommodity.get(index); 
	}

	public void output(ArrayList<Commodity> listCommodity) {
	for (Commodity commodity : listCommodity) {
		System.out.println(commodity);
	}
}
}
