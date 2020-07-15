import nextdaycalculator.NextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;


public class NextDayCalculatorTest {
    @Test
    @DisplayName("case 01-01-2018")
    public void getDatetest01(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="02-01-2018";
        today="01-01-2018";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }

    @Test
    @DisplayName("case 31-01-2018")
    public void getDatetest02(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="01-02-2018";
        today="31-01-2018";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }
    @Test
    @DisplayName("case 30-04-2018")
    public void getDatetest03(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="01-05-2018";
        today="30-04-2018";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }
    @Test
    @DisplayName("case 28-02-2018")
    public void getDatetest04(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="01-03-2018";
        today="28-02-2018";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }
    @Test
    @DisplayName("case 29-02-2020")
    public void getDatetest05(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="01-03-2020";
        today="29-02-2020";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }

    @Test
    @DisplayName("case 31-12-2018")
    public void getDatetest06(){
        String tomorrowResult,tomorrowExpected,today;
        tomorrowExpected="01-01-2019";
        today="31-12-2018";
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        NextDayCalculator Date=new NextDayCalculator(today,format);
        tomorrowResult=Date.getNextDate(format);
        assertEquals(tomorrowExpected,tomorrowResult);

    }
}
