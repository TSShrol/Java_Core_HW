/**
 * LOGOS IT academy homework lesson9 with main function 
 * */
package java_core_lesson12.task2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @since java 1.8
 * @author Tetiana Shrol
 * @version 1.1
 * */
public class Application {
	
	/**
	 * @param no input
	 * @author Tetiana Shrol
	 * @return null
	 * @see java code convention
	 * */
/*function menu */
	static void menu() {
		System.out.println("ƒл€ вибору пункту меню, введ≥ть в≥дпов≥дно його номер:");
		System.out.println(
				"1. ѕерев≥рити чи Ї такий м≥с€ць (м≥с€ць вводимо з консол≥, передбачити, щоб рег≥стр букв був не важливим.\n"
						+ "2. ¬ивести вс≥ м≥с€ц≥ з такою ж порою року\n"
						+ "3. ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в \n"
						+ "4. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в\n"
						+ "5. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в\n"
						+ "6. ¬ивести на екран наступну пору року\n" + "7. ¬ивести на екран попередню пору року\n"
						+ "8. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в\n"
						+ "9. ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в\n"
						+ "10. ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в\n"
						+ "Exit - будь-€ка кнопка");
	}

//функц≥€, що перев≥р€Ї чи Ї значенн€ р€дка month одним ≥з значень enum Months
	/**
	 * @param Months[] masMonths, String month
	 * @author Tetiana Shrol
	 * @return boolean
	 * @see java code convention
	 */
	private static boolean isMonthPresent(ArrayList<Months> listMonths, String month) {
		/*local variable flag for check availability {@param} month*/
		boolean flag = false;
		
		/*iteration cycle of enum elements*/
		for (Months m : listMonths) {
			if (m.name().equals(month)) {
				System.out.println("There is such a month");
				flag = true;
			}
		}
		return flag;
	}

		
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		/*list enum Months*/
		ArrayList <Months> listMonths = new ArrayList<>();
		for(Months month: Months.values()) 
		{
			listMonths.add(month);
		};

		/*list enum Seasons*/
		ArrayList <Seasons> listSeasons = new ArrayList<>();
		for(Seasons season: Seasons.values()) 
		{
			listSeasons.add(season);
		};

		/* Open stream for reading*/
		Scanner sc = new Scanner(System.in);
		
		/*Start loop */
		while (true) {
			
			menu();
			
			/*switch to select a menu item*/  
			switch (sc.next()) {

			/*Selecting the menu item number 1*/
			case "1": {
			try {	System.out.println("Input month:");
				String month = sc.next().toUpperCase();
				
				/* Result function call*/
				boolean flag = isMonthPresent(listMonths, month);
				if (!flag) {
					// System.out.println("Month not excist");
					throw new WrongInputConsoleParametersException("Input month "+ month+" not excist");
				}
			} catch (WrongInputConsoleParametersException e) {
				System.err.println(e.getMessage());
			}
				break;
			}
			
			/*Selecting the menu item number 2*/
			case "2": {
			try{
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;
				for (Months m : listMonths) {
					if (m.getSeason().name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					for (Months m : listMonths) {
						if (m.getSeason().toString().equals(season)) {
							System.out.println(m);
						}
					}
					if (!flag) {
						// System.out.println("Season not excist");
						throw new WrongInputConsoleParametersException("Season " + season + " not excist");
					}
				}
			} catch (WrongInputConsoleParametersException e) {
				System.err.println(e.getMessage());
			}
			break;
			}
			
			/*Selecting the menu item number 3*/
			case "3": {
				System.out.println("Input count days:");
				try {
					int day = sc.nextInt();

					boolean flag = false;
					for (Months m : listMonths) {
						if (m.getDays() == day) {
							System.out.println(m);
							flag = true;
						}
					}
					if (!flag) {
//						System.out.println("Month not excist with " + day + " days");
						throw new WrongInputConsoleParametersException("Month not excist with " + day + " days");
					}
				} catch (WrongInputConsoleParametersException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("It is not number! ");
				}
				break;
			}
			
			/*Selecting the menu item number 4*/
			case "4": {
				try {
					System.out.println("Input count days:");
					int day = sc.nextInt();
					boolean flag = false;
					for (Months m : listMonths) {
						if (m.getDays() < day) {
							System.out.println(m);
							flag = true;
						}
					}
					if (!flag) {
						System.out.println("Month not excist that is less " + day + " days. ");
						throw new WrongInputConsoleParametersException("Month not excist with " + day + " days");
					}
				} catch (WrongInputConsoleParametersException e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.err.println("неправильно введен≥ дан≥");
				}
				break;
			}
			/*Selecting the menu item number 5*/
			case "5": {
				System.out.println("Input count day in month:");
				int day = sc.nextInt();
				boolean flag = false;
				for (Months m : listMonths) {
					if (m.getDays() > day) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month not excist is more " + day + " days. ");
				}
				break;
			}
			
			/*Selecting the menu item number 6*/
			case "6": {
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();

				boolean flag = false;

				for (Seasons m : listSeasons) {
					if (m.name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season);
					int ordinal = seasons2.ordinal();
					if (ordinal == listSeasons.size() - 1) {
						ordinal = 0;
					} else {
						ordinal += 1;
					}
					System.out.println("Next season: " + listSeasons.get(ordinal));
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Input season " +season+" not excist");
				}

				break;
			}
			
			/*Selecting the menu item number 7*/
			case "7": {
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;

				for (Seasons m : listSeasons) {
					if (m.name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season);
					int ordinal = seasons2.ordinal();
					if (ordinal == 0) {
						ordinal = listSeasons.size() - 1;
					} else {
						ordinal -= 1;
					}
					System.out.println("Previous season: " +listSeasons.get(ordinal));
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Input season " +season+" not excist");
				}

				break;
			}
			
			/*Selecting the menu item number 8*/
			case "8": {
				System.out.println("months with an even number of days");
				for (Months m : listMonths) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}
			
			/*Selecting the menu item number 9*/
			case "9": {
				System.out.println("months with an odd number of days");
				for (Months m : listMonths) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}

				break;
			}
			
			/*Selecting the menu item number 10*/
			case "10": {
				System.out.println("Input month:");
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(listMonths, month);
				if (flag) {
					if (Months.valueOf(month).getDays() % 2 == 0) {
						System.out.println(month + " with an even number of days");
					} else {
						System.out.println(month + " with an odd number of days");
					}

				} else {
					throw new WrongInputConsoleParametersException("Input month "+month+ " not excist");
				}
				break;
			}
			default:
				/*Exit program*/
				System.exit(0);
			}
		}
	}

}
