package chapter.five.exercise2;


public class StatCalc {
    private int count;
    private double sum;
    private double squareSum;
    private double min = Double.MAX_VALUE;
    private double max;

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

}