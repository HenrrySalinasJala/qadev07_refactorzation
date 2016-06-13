package comp.fundacionjala.movies;

class NewReleaseMovie extends Movie implements IMovie {

    public static final double CHARGE_PER_RENTAL_DAY = 3;
    public static final int NEW_RELEASE_MOVIE = 1;
    public static int FREQUENT_RENTER_POINTS = 1;
    public static final int MINIMUM_RENTAL_DAYS = 1;

    public NewReleaseMovie(String title) {

        super(title, NEW_RELEASE_MOVIE);
    }

    public double calculateRentalCharge(int daysRented) {
        return daysRented * CHARGE_PER_RENTAL_DAY;
    }

    public int calculateRenterFrequentPoints(int daysRented) {
        if (daysRented > MINIMUM_RENTAL_DAYS)
            FREQUENT_RENTER_POINTS++;
        return FREQUENT_RENTER_POINTS;
    }
}
