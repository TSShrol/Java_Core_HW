package java_core_lesson8.task_1;

import java.util.Scanner;

public class Application {

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
						+"0. Exit");
	}

	
	public static void main(String[] args) {
		Months[] masMonths = Months.values();
		Seasons[] masSeasons = Seasons.values();
		Scanner sc = new Scanner(System.in);
		boolean flagNotExit=true;
		while(flagNotExit) {
			menu();
			switch (sc.next()) {
			case "0":{
				flagNotExit=false;
			break;		
			}
			case "1": {
				System.out.println("Input month:");
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(masMonths, month);
				if (!flag) {
					System.out.println("Month not excist");
				}
				break;
			}
			case "2": {
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;
				for (Months m : masMonths) {
					if (m.getSeason().name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					for (Months m : masMonths) {
						if (m.getSeason().toString().equals(season)) {
							System.out.println(m);
						}
					}
					if (!flag) {
						System.out.println("Season not excist");
					}
				}
				break;
			}
			case "3": {
				System.out.println("Input count days:");
				int day = sc.nextInt();
				boolean flag = false;
				for (Months m : masMonths) {
					if (m.getDays() == day) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month not excist with "+day+" days");
				}
				break;
			}
			case "4": {
				System.out.println("Input count days:");
				int day = sc.nextInt();
				boolean flag = false;
				for (Months m : masMonths) {
					if (m.getDays() < day) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month not excist that is less " + day + " days. ");
				}
				break;
			}
			case "5": {
				System.out.println("Input count day in month:");
				int day = sc.nextInt();
				boolean flag = false;
				for (Months m : masMonths) {
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
			case "6": {
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;

				for (Seasons m : masSeasons) {
					if (m.name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season);
					int ordinal = seasons2.ordinal();
					if (ordinal == masSeasons.length - 1) {
						ordinal = 0;
					} else {
						ordinal += 1;
					}
					System.out.println("Next season: " + masSeasons[ordinal]);
				}
				if (!flag) {
					System.out.println("Season not excist");
				}

				break;
			}
			case "7": {
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;

				for (Seasons m : masSeasons) {
					if (m.name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons seasons2 = Seasons.valueOf(season);
					int ordinal = seasons2.ordinal();
					if (ordinal == 0) {
						ordinal = masSeasons.length - 1;
					} else {
						ordinal -= 1;
					}
					System.out.println("Previous season: " + masSeasons[ordinal]);
				}
				if (!flag) {
					System.out.println("Season not excist");
				}

				break;
			}
			case "8": {
				System.out.println("months with an even number of days");
				for (Months m : masMonths) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}

				break;
			}
			case "9": {
				System.out.println("months with an odd number of days");
				for (Months m : masMonths) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}

				break;
			}
			case "10": {
				System.out.println("Input month:");
				String month = sc.next().toUpperCase();
				boolean flag=isMonthPresent(masMonths,month);
				if (flag) {
					if(Months.valueOf(month).getDays()%2==0) {
						System.out.println(month+" with an even number of days");
					}else {
						System.out.println(month+" with an odd number of days");
					}
						
				}else {
					System.out.println("Months not exists");
					}
				break;
			}
			}
		}
		sc.close();
		
	}

	private static boolean isMonthPresent(Months[] masMonths, String month) {
		boolean flag = false;
		for (Months m : masMonths) {
			if (m.name().equals(month)) {
				System.out.println("There is such a month");
				flag = true;
			}
		}
		return flag;
	}

}
