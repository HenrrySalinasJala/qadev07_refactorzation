package comp.fundacionjala.movies;

/**
 * Concrete class that implements the logic of a New Release Movie Object
 */
class NewReleaseMovie extends Movie implements IMovie {

    private static final double CHARGE_PER_RENTAL_DAY = 3;

    private static final int FREQUENT_RENTER_POINTS = 1;

    private static final int THRESHOLD_DAYS = 1;

    public static final int BONUS_POINTS = 1;

    public NewReleaseMovie(String title) {
        super(title, CHARGE_PER_RENTAL_DAY, THRESHOLD_DAYS, FREQUENT_RENTER_POINTS);
    }

    /**
     * {@inheritDoc}
     */
    public double calculateRentalCharge(int daysRented) {
        return daysRented * CHARGE_PER_RENTAL_DAY;
    }

    /**
     * {@inheritDoc}
     */
    public int calculateRenterFrequentPoints(int daysRented) {
        return daysRented > threshold_days ? frequent_renter_points + BONUS_POINTS : frequent_renter_points;
    }
}
