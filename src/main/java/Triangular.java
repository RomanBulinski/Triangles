import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Triangular {


    public int check(int[] A) {

        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        if (A[A.length - 1] < 0) {
            return 0;
        }
        if (A[0] > 0) {
            for (int i = 2; i < A.length; i++) {
                if (A[i - 2] + A[i - 1] > A[i]) {
                    return 1;
                }
            }
            return 0;
        }

        int index = binarySearch(A, 0);

        if (index > 0) {
            int[] B = copyOfRange(A, index, A.length - 1);
            if (B.length < 3) {
                return 0;
            }
            for (int i = 2; i < B.length; i++) {
                if (B[i - 2] + B[i - 1] > B[i]) {
                    return 1;
                }
            }
            return 0;
        }

        for (int i = 2; i < A.length; i++) {
            if (A[i - 2] > 0 && A[i - 2] + A[i - 1] > A[i]) {
                return 1;
            }
        }
        return 0;
    }

}
