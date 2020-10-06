package assignment11;
import java.io.*;

public class FutureDate {

	public String futureDate(String date1, int day)throws IOException
	    {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	        //System.out.print("Enter the date in (dd/mm/yyyy) format: ");
	        //String date=br.readLine().trim();
	        String date  = date1.trim();
	        String str;
	        int p,q,count=0;
	        p=date.indexOf("/");
	        int d=Integer.parseInt(date.substring(0,p));
	        q=date.lastIndexOf("/");
	        int m=Integer.parseInt(date.substring(p+1,q));
	        int y=Integer.parseInt(date.substring(q+1));
	        //System.out.println("Entered Date: "+date);
	 
	        if((y%400==0) || ((y%100!=0)&&(y%4==0))) // Checking for leap year
	        month[2]=29;
	 
	        if(m<0 || m>12 || d<0 || d>month[m] || y<0 || y>9999) // Performing Date Validation
	        {
	            str = "Invalid Date";
	            return str;
	        }
	        else
	        {
	            //System.out.print("Enter number of days after which future date is to be found: ");
	            //int days=Integer.parseInt(br.readLine());
	        	int days = day;
	            while(count<days)
	            {
	                d++;
	                count++;
	                 
	                /* If day exceeds the maximum days of a month then day should start from 1
	                   and month should increase */
	 
	                if(d>month[m])
	                {
	                    d=1;
	                    m++;
	                }
	                 
	                /* If month exceeds 12 then month should start from 1
	                   and year should increase */
	                if(m>12)
	                {
	                    m=1;
	                    y++;
	                    if((y%400==0) || ((y%100!=0)&&(y%4==0)))
	                        month[2]=29;
	                    else
	                        month[2]=28;
	                }
	            }
	           return d+"/"+m+"/"+y;
	        }
	    }
}
