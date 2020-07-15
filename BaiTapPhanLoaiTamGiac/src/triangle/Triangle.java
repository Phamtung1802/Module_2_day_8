package triangle;

public class Triangle {

    public static final String KHONG_PHAI_TAM_GIAC = "Khong Phai Tam Giac";
    public static final String TAM_GIAC_DEU = "Tam Giac Deu";
    public static final String TAM_GIAC_CAN = "Tam Giac Can";
    public static final String TAM_GIAC_THUONG = "Tam Giac Thuong";

    public static String classifyTriangle(int side1, int side2, int side3){
        boolean areSidesEqual_0_OrLess = side1 <= 0 || side2 <= 0 || side3 <= 0;
        boolean areTwoSidesEqual= (side1==side2&&side2!=side3)||(side1==side3&&side3!=side2)||(side2==side3&&side3!=side1);
        boolean areSidesTotalValid = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        boolean areSidesEqual = side1 == side2 && side2 == side3 && side1 == side3;

        if(areSidesEqual_0_OrLess){
            return KHONG_PHAI_TAM_GIAC;
        }

        if(areSidesEqual){
            return TAM_GIAC_DEU;
        }

        if(areTwoSidesEqual && areSidesTotalValid) {
            return TAM_GIAC_CAN;
        }
        if(areSidesTotalValid){
            return TAM_GIAC_THUONG;
        }
        return KHONG_PHAI_TAM_GIAC;
    }

}
