package assignment11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TodayDate {

	   public String todayDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMMM dd, yyyy");
		String stringDate = sdf.format(new Date());
		//System.out.println("Today is: "+stringDate);
		return stringDate;
	   }
	
}
