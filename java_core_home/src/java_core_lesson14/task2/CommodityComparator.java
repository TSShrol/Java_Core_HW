package java_core_lesson14.task2;

import java.util.Comparator;

public class CommodityComparator implements Comparator<Commodity> {
	private CommodityEnum sortingIndex;

	public CommodityComparator(CommodityEnum sortingIndex) {
		setSortingIndex(sortingIndex);
	}

	public final void setSortingIndex(CommodityEnum sortingIndex) {
		if (sortingIndex == null) {
			throw new IllegalArgumentException();
		}
		this.sortingIndex = sortingIndex;
	}
	public CommodityEnum getSortingIndex() {
		return sortingIndex;
	} 

	@Override
	public int compare(Commodity o1, Commodity o2) {
		switch(sortingIndex) {
		case NAMECOMMODITY:{
			return (o1.getnameCommodity().compareToIgnoreCase(o2.getnameCommodity()));
		}
		case LENGTH:{
			return Double.compare(o1.getLength(),o2.getLength());
			}
		case WIDTH:{
			return Double.compare(o1.getWidth(),o2.getWidth());
			}
		case WEIGHT:{
			return Double.compare(o1.getWeight(),o2.getWeight());
		}
		default:{
				throw new EnumConstantNotPresentException(CommodityEnum.class, sortingIndex.name());}
			}
		}
	}




