import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateformat
{
    public static void main(String args[]) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sd=new SimpleDateFormat("DD:MM:YYYY HH:MM:ss");
        Date t=sd.parse("26:05:1994 12:22:56");
        Calendar cal=Calendar.getInstance();
        cal.setTime(t);


        SimpleDateFormat sd1=new SimpleDateFormat("yyyy:MM:DD HH:MM:SS");
        System.out.println(sd1.format(t));

    }

}
