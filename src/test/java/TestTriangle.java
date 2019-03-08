import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangle {

    @Test
    public void testCheck(){
        Triangular triangular = new Triangular();
        int[] arr = { 10,1,3,5,8 };
        assertEquals(1, triangular.check(arr));
    }

    @Test
    public void testCheck2(){
        Triangular triangular = new Triangular();
        int[] arr = { 10,1,2,30,100  };
        assertEquals(0, triangular.check(arr));
    }

    @Test
    public void testCheckshortArray(){
        Triangular triangular = new Triangular();
        int[] arr = { 10,1 };
        assertEquals(0, triangular.check(arr));
    }

    @Test
    public void testCheckshortArrayLessThenZero(){
        Triangular triangular = new Triangular();
        int[] arr = {-10,-20,-60,-5,-6 };
        assertEquals(0, triangular.check(arr));
    }

    @Test
    public void testCheckArrWithOneIntGreaterThenZero(){
        Triangular triangular = new Triangular();
        int[] arr = {-10,-20,-60,-5,-6,-100,-101,5,10 };
        assertEquals(0, triangular.check(arr));
    }

}
