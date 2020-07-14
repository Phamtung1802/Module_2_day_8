public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz=number%3==0;
        boolean isbuzz=number%5==0;
        if(isFizz && isbuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isbuzz)
            return "Buzz";

        return number + "";
    }
}
