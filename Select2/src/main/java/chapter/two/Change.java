package chapter.two;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Change {
    private static final int DOLLAR = 100;
    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;
    private final int quarterCount;
    private final int dimeCount;
    private final int nickelCount;
    private final int pennyCount;

    public Change(int quarterCount, int dimeCount, int nickelCount, int pennyCount) {
        this.quarterCount = quarterCount;
        this.dimeCount = dimeCount;
        this.nickelCount = nickelCount;
        this.pennyCount = pennyCount;
    }

    public BigDecimal convertDollar() {
        int totalCent = quarterCount * QUARTER + dimeCount * DIME
                + nickelCount * NICKEL + pennyCount * PENNY;
        BigDecimal dollar = new BigDecimal(String.valueOf(DOLLAR));
        return new BigDecimal(String.valueOf(totalCent)).divide(dollar, 3, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Change{" +
                "quarter=" + this.quarterCount +
                ", dime=" + this.dimeCount +
                ", nickel=" + this.nickelCount +
                ", penny=" + this.pennyCount +
                '}';
    }
}
