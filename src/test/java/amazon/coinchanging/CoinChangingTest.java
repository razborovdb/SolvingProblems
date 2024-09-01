package amazon.coinchanging;

import org.junit.jupiter.api.Test;

import static amazon.coinchanging.CoinChanging.solveCoinChange;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangingTest {

    @Test
    public void correctInputData_solveCoinChange_expectedResult() {
        int[] denominations = new int[] {1, 3, 5};
        int amount = 7;
        int result = solveCoinChange(denominations, amount);
        int expected = 4;
        assertEquals(expected, result);
    }
}
