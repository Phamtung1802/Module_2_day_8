package baitapfizzbuzz;

public class FizzBuzz {

    public static String translateFizzBuzz(int number){
        Integer numberOBJ= number;
        String numberStr=numberOBJ.toString();
        if(number<0||number>=100){
            return numberStr;
        }
        if((number%3==0&&number%5==0)||(numberStr.contains("3")&&numberStr.contains("5"))){
            return "FizzBuzz";
        }
        if(number%3==0||numberStr.contains("3")){
            return "Fizz";
        }
        if(number%5==0||numberStr.contains("5")){
            return "Buzz";
        }
        return "Error";
    }
}
