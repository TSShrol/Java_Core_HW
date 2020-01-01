/**
 * LOGOS IT academy homework lesson9 - enum Months
 * */
package java_core_lesson9.task_1;

/**
 * @since java 1.8
 * @author Tetiana Shrol
 * @version 1.1
 * */
public enum Months {
	/* consts to enum */
	JENUERY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.AUTUMN), OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN),
	DECEMBER(31, Seasons.WINTER);

	/* days to enum */
	private int days;

	/* season to enum */
	private Seasons season;

	/*This is constructor*/
	Months(int days, Seasons season) {
		this.days = days;
		this.season = season;
	}

	/*getter for days*/
	public int getDays() {
		return days;
	}

	/*getter for season*/
	public Seasons getSeason() {
		return season;
	}
}
