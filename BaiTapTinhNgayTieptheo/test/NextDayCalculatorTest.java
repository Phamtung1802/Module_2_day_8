import nextdaycalculator.NextDayCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NextDayCalculatorTest {
    @Test
    public void getDatetest(){
       String Today= NextDayCalculator.date;


        String TomorrowResult,TomorrowExpected;

        assertEquals(TodayResult,TodayExpected);
        assertEquals(TmrResult,TmrExpected);
    }
}
