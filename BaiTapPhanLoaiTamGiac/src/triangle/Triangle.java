package triangle;

public class Triangle {

    public static final String KHONG_PHAI_TAM_GIAC = "Khong Phai Tam Giac";
    public static final String TAM_GIAC_DEU = "Tam Giac Deu";
    public static final String TAM_GIAC_CAN = "Tam Giac Can";
    public static final String TAM_GIAC_THUONG = "Tam Giac Thuong";

    public static String classifyTriangle(int side1, int side2, int side3){
        if(areSidesValid(side1, side2, side3)){
            return KHONG_PHAI_TAM_GIAC;
        }
        if(areSidesEqual(side1, side2, side3)){
            return TAM_GIAC_DEU;
        }
        if(areAny2SidesEqual(side1, side2, side3)&&areSidesTotalValid(side1, side2, side3)) {
            return TAM_GIAC_CAN;
        }
        if(areSidesTotalValid(side1, side2, side3)){
            return TAM_GIAC_THUONG;
        }
        return KHONG_PHAI_TAM_GIAC;
    }

    private static boolean areSidesTotalValid(int side1, int side2, int side3) {
        return (side1+side2>=side3)&&(side1+side3>=side2)&&(side2+side3>=side1);
    }

    private static boolean areAny2SidesEqual(int side1, int side2, int side3) {
        return (side1==side2&&side2!=side3)||(side1==side3&&side3!=side2)||(side2==side3&&side3!=side1);
    }

    private static boolean areSidesEqual(int side1, int side2, int side3) {
        return side1==side2&&side2==side3&&side1==side3;
    }

    private static boolean areSidesValid(int side1, int side2, int side3) {
        return side1<=0||side2<=0||side3<=0;
    }
}
