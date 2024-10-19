public class SurgeFareStrategy implements FareStrategy {
    private static final double PER_KM_RATE = 2.00;
    private static final double PER_MINUTE_RATE = 0.50;

    @Override
    public double calculateFare(double distance, double time) {
        return distance * PER_KM_RATE + time * PER_MINUTE_RATE;
    }
}
