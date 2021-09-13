package comcave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
	 //	GregorianCalender
	}

}
