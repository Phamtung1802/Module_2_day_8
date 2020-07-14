package baitapfizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String ERROR = "Error";

    public static String translateFizzBuzz(int number){
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        Integer numberOBJ= number;
        String numberString=numberOBJ.toString();

        if(number<0||number>=100){
            return numberString;
        }
        if((isDivisibleBy3 && isDivisibleBy5)||(numberString.contains("3")&&numberString.contains("5"))){
            return FIZZ_BUZZ;
        }
        if(isDivisibleBy3 ||numberString.contains("3")){
            return FIZZ;
        }
        if(isDivisibleBy5 ||numberString.contains("5")){
            return BUZZ;
        }
        return ERROR;
    }
}
