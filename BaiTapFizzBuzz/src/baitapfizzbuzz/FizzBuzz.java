package baitapfizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String ERROR = "Error";
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 99;
    public static String translateFizzBuzz(int number){
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        Integer numberOBJ= number;
        String numberString=numberOBJ.toString();
        boolean doesContain3 = numberString.contains("3");
        boolean doesContain5 = numberString.contains("5");

        if(number< MIN_VALUE ||number> MAX_VALUE){
            return numberString;
        }

        if((isDivisibleBy3 && isDivisibleBy5)||(doesContain3 && doesContain5)){
            return FIZZ_BUZZ;
        }
        if(isDivisibleBy3 || doesContain3){
            return FIZZ;
        }
        if(isDivisibleBy5 || doesContain5){
            return BUZZ;
        }
        return ERROR;
    }
}
