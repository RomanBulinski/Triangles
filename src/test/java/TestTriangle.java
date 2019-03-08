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


}
