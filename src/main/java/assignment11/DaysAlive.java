package assignment11;

import java.util.Calendar;

public class DaysAlive {

	public int daysAlive(int birthYear, int birthMonth, int birthDate) {
		
	       Calendar calobj = Calendar.getInstance();
	       int year = calobj.get(Calendar.YEAR);
	       int month = calobj.get(Calendar.MONTH)+1;
	       int date = calobj.get(Calendar.DAY_OF_MONTH);
	      // System.out.println(date + "/" + month + "/" + year);
	       
	       int daysAlive = (year - birthYear) * 365 +(month  - birthMonth) * 30 + (date - birthDate);
	       //System.out.println(DaysAlive + " days");
	       return daysAlive;

	}
	

}
