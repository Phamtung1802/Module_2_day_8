package nextdaycalculator;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class NextDayCalculator {
    public String date;
    public SimpleDateFormat dateFormat;
    static SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");

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
