import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import triangle.*;

import static org.junit.jupiter.api.Assertions.*;

public class triangletest {
    @Test
    @DisplayName("Case 2 2 2 Tam Giac Deu")
    public void classifyTriangletest(){
        int side1=2;
        int side2=2;
        int side3=2;
        String expected="Tam Giac Deu";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
    @Test
    @DisplayName("Case 2 2 3 Tam Giac Can")
    public void classifyTriangletest2(){
        int side1=2;
        int side2=2;
        int side3=3;
        String expected="Tam Giac Can";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
    @Test
    @DisplayName("Case 3 4 5 Tam Giac Thuong")
    public void classifyTriangletest3(){
        int side1=3;
        int side2=4;
        int side3=5;
        String expected="Tam Giac Thuong";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
    @Test
    @DisplayName("Case 8 2 3 Khong Phai Tam Giac")
    public void classifyTriangletest4(){
        int side1=8;
        int side2=2;
        int side3=3;
        String expected="Khong Phai Tam Giac";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
    @Test
    @DisplayName("Case -1 2 1 Khong Phai Tam Giac")
    public void classifyTriangletest5(){
        int side1=-1;
        int side2=2;
        int side3=1;
        String expected="Khong Phai Tam Giac";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
    @Test
    @DisplayName("Case 0 1 1 Khong Phai Tam Giac")
    public void classifyTriangletest6(){
        int side1=0;
        int side2=1;
        int side3=1;
        String expected="Khong Phai Tam Giac";
        assertEquals(expected,Triangle.classifyTriangle(side1,side2,side3));
    }
}
