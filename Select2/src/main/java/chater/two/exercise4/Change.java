package chater.two.exercise4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

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

    public static class Builder {
        private int quarterCount = 0;
        private int dimeCount = 0;
        private int nickelCount = 0;
        private int pennyCount = 0;

        private void precondition(int value) {
            if (value < 0) {
                throw new IllegalArgumentException("음수가 들어올 수 없습니다.");
            }
        }

        public Builder(){
        }

        public Builder quarter(int quarterCount) {
            precondition(quarterCount);
            this.quarterCount = quarterCount;
            return this;
        }

        public Builder dime(int dimeCount) {
            precondition(dimeCount);
            this.dimeCount = dimeCount;
            return this;
        }

        public Builder nickel(int nickelCount) {
            precondition(nickelCount);
            this.nickelCount = nickelCount;
            return this;
        }

        public Builder penny(int pennyCOunt) {
            precondition(pennyCOunt);
            this.pennyCount = pennyCOunt;
            return this;
        }

        public Change build() {
            return new Change(this);
        }
    }

    private Change(Builder builder) {
        Objects.requireNonNull(builder);
        this.quarterCount = builder.quarterCount;
        this.dimeCount = builder.dimeCount;
        this.nickelCount = builder.nickelCount;
        this.pennyCount = builder.pennyCount;
    }

    public BigDecimal convertDollar(){
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
