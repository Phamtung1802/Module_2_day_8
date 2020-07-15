package nextdaycalculator;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class NextDayCalculator {

    public Scanner sc = new Scanner(System.in);
    public String date;
    public SimpleDateFormat dateFormat;
    public NextDayCalculator(){

    }
    public NextDayCalculator (String date,SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
        this.date = date;

    }

    public String getNextDate(SimpleDateFormat dateFormat){
        Date dateParsed = dateFormat.parse(this.date,new ParsePosition(0));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateParsed);
        calendar.add(calendar.DATE,1);
        return dateFormat.format(calendar.getTime());
    }

}
