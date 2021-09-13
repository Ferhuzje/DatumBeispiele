package comcave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Date datum1 = new Date(); 
		//aktuelles Datum & Zeit
		System.out.println(datum1);
		
		Date datum2 = new Date(2021 - 1900, 9, 13, 10, 30, 10);
		System.out.println(datum2);
		
		// Datum formatieren
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		System.out.println( dateFormat.format(datum2) );
		
		
		// 2021-9-05
		DateFormat dateFormatDB = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(dateFormatDB.format(datum2));
		
		// Monat beginnt bei 0
	 	GregorianCalendar gc = new GregorianCalendar(2021, 8, 13);
	    System.out.println(gc.getTime());
	    System.out.println("Tag: " + gc.get(Calendar.DAY_OF_MONTH) );
	    System.out.println("Wochentag-Nr.: " + gc.get(Calendar.DAY_OF_WEEK));
	    System.out.println("Wochentag Name: " +gc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.getDefault()));
	    System.out.println("Monat- Nr.: " + gc.get(Calendar.MONTH)); 
	    System.out.println("Jahr: " + gc.get(Calendar.YEAR));
	    
	
	}

}
