package comp.fundacionjala.movies;

/**
 * Concrete class that implements the logic of a Regular Movie Object
 */
class RegularMovie extends Movie implements IMovie {

    private static final double INITIAL_CHARGE = 2;

    private static final double CHARGE_PER_RENTAL_DAY = 1.5;

    private static final int THRESHOLD_DAYS = 2;

    private static final int FREQUENT_RENTER_POINTS = 1;

    public RegularMovie(String title) {
        super(title, CHARGE_PER_RENTAL_DAY, THRESHOLD_DAYS, FREQUENT_RENTER_POINTS);
    }

    /**
     * {@inheritDoc}
     */
    public double calculateRentalCharge(int daysRented) {
        return daysRented > threshold_days ? INITIAL_CHARGE + ((daysRented - threshold_days) * charge_per_rental_day) : INITIAL_CHARGE;
    }

    /**
     * {@inheritDoc}
     */
    public int calculateRenterFrequentPoints(int daysRented) {
        return frequent_renter_points;
    }
}
