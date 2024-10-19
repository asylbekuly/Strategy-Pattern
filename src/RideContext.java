public class RideContext {
    private FareStrategy fareStrategy;
    private static final double MIN_FARE = 5.00;

    public RideContext(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distance, double time, boolean isPeakHour) {
        if (distance < 0 || time < 0) {
            throw new IllegalArgumentException("Distance or time cannot be negative");
        }

        double fare = fareStrategy.calculateFare(distance, time);

        // Применение минимального тарифа
        if (fare < MIN_FARE) {
            fare = MIN_FARE;
        }

        // Если час пик применяем стратегию увеличения тарифа
        if (isPeakHour) {
            fare *= 2;
        }

        return fare;
    }
}
