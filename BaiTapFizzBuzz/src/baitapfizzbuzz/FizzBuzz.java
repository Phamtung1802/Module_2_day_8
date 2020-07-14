package baitapfizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String ERROR = "Error";

    public static String translateFizzBuzz(int number){
        boolean isNumberDivisibleBy3 = number % 3 == 0;
        boolean isNumberDivisibleBy5 = number % 5 == 0;
        Integer numberOBJ= number;
        String numberStr=numberOBJ.toString();

        if(number<0||number>=100){
            return numberStr;
        }
        if((isNumberDivisibleBy3 && isNumberDivisibleBy5)||(numberStr.contains("3")&&numberStr.contains("5"))){
            return FIZZ_BUZZ;
        }
        if(isNumberDivisibleBy3 ||numberStr.contains("3")){
            return FIZZ;
        }
        if(isNumberDivisibleBy5 ||numberStr.contains("5")){
            return BUZZ;
        }
        return ERROR;
    }
}
