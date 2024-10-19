public class RegularFareStrategy implements FareStrategy {
    private static final double PER_KM_RATE = 1.00;
    private static final double PER_MINUTE_RATE = 0.25;

    @Override
    public double calculateFare(double distance, double time) {
        return distance * PER_KM_RATE + time * PER_MINUTE_RATE;
    }
}
