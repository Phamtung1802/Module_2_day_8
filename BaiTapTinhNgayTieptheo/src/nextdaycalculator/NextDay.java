package nextdaycalculator;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {

        System.out.println("Nhap Ngay Theo Format dd-MM-yyyy: ");
        Scanner sc = new Scanner(System.in);
        String today=sc.nextLine();
        NextDayCalculator Date=new NextDayCalculator(today,NextDayCalculator.format);
        String NgayTiepTheo=Date.getNextDate(NextDayCalculator.format);

        System.out.println("Ngay Tiep Theo La: "+ NgayTiepTheo);
    }
}
