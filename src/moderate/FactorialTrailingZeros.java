/**
 * CTCI 17.3
 */
package moderate;

public class FactorialTrailingZeros {
    public static int solution(int n) {
        int count = 0;
        if (n < 0) {
            return -1;
        }
        for (int i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
