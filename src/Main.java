public class Main {
    public static void main(String[] args) {
        RideContext context = new RideContext(new RegularFareStrategy());

        System.out.println("Regular Fare: " + context.calculateFare(8, 20, false)); //  обычная
        context.setFareStrategy(new PremiumFareStrategy());
        System.out.println("Premium Fare: " + context.calculateFare(8, 20, false)); //  подроже
        context.setFareStrategy(new DiscountFareStrategy());
        System.out.println("Discount Fare: " + context.calculateFare(8, 20, false)); // скидка
        context.setFareStrategy(new SurgeFareStrategy());
        System.out.println("Surge Fare (Peak Hour): " + context.calculateFare(8, 20, true)); //  час пик
    }
}

