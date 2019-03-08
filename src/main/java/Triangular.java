import java.util.Arrays;
import java.util.Collections;

public class Triangular {


    public int check(int[] A){

        Arrays.sort(A);

        for ( int i = 2; i<A.length; i++){
            if( A[i-2]+A[i-1]>A[i] ){
                 return 1;
            }
        }
        return 0;
    }

}
