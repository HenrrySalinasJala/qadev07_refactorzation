package comp.fundacionjala.movies;

class RegularMovie extends Movie implements IMovie {

    public static final double CHARGE_PER_RENTAL_DAY = 1.5;
    public static final double INITIAL_CHARGE = 2;
    public static final double THRESHOLD_DAYS = 2;
    public static final int REGULAR_MOVIE = 0;
    public static final int FREQUENT_RENTER_POINTS = 1;

    public RegularMovie(String title) {

        super(title, REGULAR_MOVIE);
    }

    public double calculateRentalCharge(int daysRented) {

        double charge = INITIAL_CHARGE;
        if (daysRented > THRESHOLD_DAYS)
            charge += (daysRented - THRESHOLD_DAYS) * CHARGE_PER_RENTAL_DAY;
        return charge;
    }

    public int calculateRenterFrequentPoints(int daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
