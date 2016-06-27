package comp.fundacionjala.movies;

/**
 * abstract class to initialize the common methods and attributes
 * of the methods that extends this class
 */
abstract class Movie {

    private final String title;

    protected static final int FREQUENT_RENTER_POINTS = 1;

    protected final double charge_per_rental_day;

    protected final int threshold_days;

    protected int frequent_renter_points;

    public Movie(String title, double chargePerRentalDay, int thresholdDays, int frequentRenterPoints) {
        this.title = title;
        this.charge_per_rental_day = chargePerRentalDay;
        this.threshold_days = thresholdDays;
        this.frequent_renter_points = frequentRenterPoints;
    }

    public String getTitle() {
        return title;
    }
}
